create or replace procedure ProcessMonthlyInterest
    as 
begin 
    update accounts 
    set balance=balance+(balance*0.01)
    where accounttype='Savings';
end ;

BEGIN
    ProcessMonthlyInterest;
END;
/