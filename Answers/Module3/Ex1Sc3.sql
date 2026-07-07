DECLARE
    cursor marked_customers is 
    select * from loans
        where ENDDATE BETWEEN TRUNC(SYSDATE) AND TRUNC(SYSDATE)+30;
Begin 
    for cust in marked_customers loop
        DBMS_OUTPUT.PUT_LINE(cust.CUSTOMERID);
    END LOOP;
END;