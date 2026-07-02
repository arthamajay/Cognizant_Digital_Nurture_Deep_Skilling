DECLARE
    CURSOR C_CUSTOMERS IS
    SELECT
        CUSTOMERID,
        BALANCE
    FROM
        CUSTOMERS;

    V_CUSTOMERID CUSTOMERS.CUSTOMERID%TYPE;
    V_BALANCE    CUSTOMERS.BALANCE%TYPE;
BEGIN
    OPEN C_CUSTOMERS;
    LOOP
        FETCH C_CUSTOMERS INTO
            V_CUSTOMERID,
            V_BALANCE;
        EXIT WHEN C_CUSTOMERS%NOTFOUND;
        IF V_BALANCE > 10000 THEN
            UPDATE CUSTOMERS
            SET
                ISVIP = 'Y'
            WHERE
                CUSTOMERID = V_CUSTOMERID;

        ELSE
            UPDATE CUSTOMERS
            SET
                ISVIP = 'N'
            WHERE
                CUSTOMERID = V_CUSTOMERID;

        END IF;

    END LOOP;

    CLOSE C_CUSTOMERS;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('VIP status updated successfully.');
END;
/