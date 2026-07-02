DECLARE
    CURSOR L_LOANS IS
    SELECT
        CUSTOMERID,
        LOANID
    FROM
        LOANS
    WHERE
        ENDDATE BETWEEN SYSDATE AND SYSDATE + 30;

    L_CUSTOMER_ID LOANS.CUSTOMERID%TYPE;
    L_LOAN_ID     LOANS.LOANID%TYPE;
BEGIN
    OPEN L_LOANS;
    DBMS_OUTPUT.PUT_LINE('Customers whose deadline is in next 30 days');
    LOOP
        FETCH L_LOANS INTO
            L_CUSTOMER_ID,
            L_LOAN_ID;
        EXIT WHEN L_LOANS%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('Customer Id : '
                             || L_CUSTOMER_ID
                             || ' Loan Id : ' || L_LOAN_ID);
    END LOOP;

    CLOSE L_LOANS;
END;
/