
Create or replace Function 
          FNet(pename Emp.ename%type)
return Emp.sal%type
Is
    vnet    Emp.sal%type;
Begin
     SELECT NVL(sal,0)+NVL(comm,0) INTO vnet
    From emp 
    WHERE UPPER(ename)=UPPER(pename);
    return vnet;
End;
/