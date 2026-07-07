Begin 
    update customers 
    set isVIP='Y'
    where balance>10000;
    DBMS_OUTPUT.PUT_LINE('Updated VIP Status');
END;
