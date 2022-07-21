
Create or replace Function 
            FEname(pempno  number) return varchar
Is
    vename  varchar(20);
Begin
        SELECT ename  INTO vename
        FROM emp WHERE 
        empno=pempno;

      return vename;
End FEname;
/