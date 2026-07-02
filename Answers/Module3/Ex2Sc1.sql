create or replace PROCEDURE SAFETRANSFER (
    FORMACC IN NUMBER,
    TOACC   IN NUMBER,
    AMOUNT  IN NUMBER
)
v_balance Accounts.Balanace%TYPE;
insufficient_funds EXCEPTION;

begin
 SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_account;

if v_balance < amount then
raise insufficient_funds;
end if;
    UPDATE
    ACCOUNTS
    SET
    BALANCE = BALANCE - P_AMOUNT
    WHERE
        ACCOUNTID = P_FROM_ACCOUNT;
    UPDATE
    ACCOUNTS
    SET
    BALANCE = BALANCE + P_AMOUNT
    WHERE
        ACCOUNTID = P_TO_ACCOUNT;
        COMMIT;
        DBMS_OUTPUT.PUT_LINE ( 'Transfer Successful' );
    EXCEPTION
    WHEN
    INSUFFICIENT_FUNDS
    THEN
        DBMS_OUTPUT.PUT_LINE ( "insufficient_funds" );
        ROLLBACK;
    WHEN
    OTHERS
    THEN
    DBMS_OUTPUT.PUT_LINE ( SQLERRM )
        ROLLBACK;