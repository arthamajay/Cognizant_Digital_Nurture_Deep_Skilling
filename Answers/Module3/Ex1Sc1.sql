DECLARE
    CURSOR C_CUSTOMERS IS
    SELECT
        CUSTOMERID,
        DOB
    FROM
        CUSTOMERS;

    V_CUSTOMER_ID CUSTOMERS.CUSTOMERID%TYPE;
    V_DOB         CUSTOMERS.DOB%TYPE;
    V_AGE         NUMBER;
BEGIN
    OPEN C_CUSTOMERS;
    LOOP
        FETCH C_CUSTOMERS INTO
            V_CUSTOMER_ID,
            V_DOB;
        EXIT WHEN C_CUSTOMERS%NOTFOUND;
        V_AGE := FLOOR(MONTHS_BETWEEN(SYSDATE, V_DOB) / 12);
        IF V_AGE > 60 THEN
            DBMS_OUTPUT.PUT_LINE('Customer ID : '
                                 || V_CUSTOMER_ID
                                 || ' Age : ' || V_AGE);
        END IF;

    END LOOP;

    CLOSE C_CUSTOMERS;
END;
/