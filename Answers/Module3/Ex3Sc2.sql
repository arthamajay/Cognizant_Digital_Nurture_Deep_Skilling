create or replace PROCEDURE UpdateEmployeeBonus(Dept in VARCHAR2,bonus in NUMBER) as 
begin
    update employees 
    set salary=salary+(bonus*salary/100)
    where department=dept;
END;
/

begin 
    UpdateEmployeeBonus('Finance',10);
END;