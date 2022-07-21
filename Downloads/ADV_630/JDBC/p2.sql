
Create or replace Procedure 
           PCalc(x in number,y in number,
                       a out number,s out number,
                       m out number)
Is
Begin
   a:=x+y;
   s:=x-y;
   m:=x*y;
End;
/