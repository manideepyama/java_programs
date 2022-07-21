
Create or replace procedure 
   PEInfo(pempno in emp.empno%type,
                 pename out emp.ename%type,
                 pejob     out emp.job%type,
                 pesal      out emp.sal%type)
Is
Begin
   SELECT ename,job,sal INTO pename,pejob,pesal
              FROM emp WHERE empno=pempno;
Exception 
    WHEN NO_DATA_FOUND Then
        dbms_output.put_line('Sorry Rec not Existed...');
End;
/



