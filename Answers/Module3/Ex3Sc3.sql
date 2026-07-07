create or replace procedure TransferFunds(source_id IN NUMBER,dest_id IN NUMBER,amount NUMBER)
as 
v_amount NUMBER;
no_salary_exception EXCEPTION;

begin 
    select salary into v_amount
    from EMPLOYEES where employeeID=source_id;
    if v_amount<amount then
        raise no_salary_exception;
    end if;

    update EMPLOYEES 
    set salary=salary-amount
    where employeeId=source_id;
    
    update EMPLOYEES 
    set salary=salary+amount
    where employeeId=dest_id;
EXCEPTION 
    when no_salary_exception then
    RAISE_APPLICATION_ERROR(-20002, 'Transfer Failed: Insufficient funds in the source account.');
END;
/

BEGIN
    TRANSFERFUNDS(4,3,10000);
END;
/

BEGIN
    TRANSFERFUNDS(4,3,1000000);
END;
/