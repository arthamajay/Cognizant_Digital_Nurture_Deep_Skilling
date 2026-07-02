DECLARE
    CURSOR C_LOANS IS
    SELECT
        LOANID,
        INTERESTRATE
    FROM
        LOANS;

    V_LOAN_ID LOANS.LOANID%TYPE;
    V_RATE    LOANS.INTERESTRATE%TYPE;
BEGIN
    OPEN C_LOANS;
    LOOP
        FETCH C_LOANS INTO
            V_LOAN_ID,
            V_RATE;
        EXIT WHEN C_LOANS%NOTFOUND;
        IF V_RATE < 10 THEN
            UPDATE LOANS
            SET
                INTERESTRATE = INTERESTRATE + 0.5
            WHERE
                LOANID = V_LOAN_ID;

        END IF;

    END LOOP;

    CLOSE C_LOANS;
    COMMIT;
END;
/