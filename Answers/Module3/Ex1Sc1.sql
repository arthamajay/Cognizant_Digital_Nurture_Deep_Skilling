declare 
    cursor c_customers is
    select l.LoanID, l.CustomerID, l.InterestRate, c.DOB
    from customers c 
    join loans l on l.CUSTOMERID=c.CUSTOMERID
    where TRUNC(MONTHS_BETWEEN(SYSDATE,c.DOB)/12)>40;
begin 
    for rec in c_customers LOOP
        update LOANS 
        set INTERESTRATE=INTERESTRATE-1
        where CUSTOMERID=rec.CUSTOMERID;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Updated Interest rates');
    COMMIT;
END;

