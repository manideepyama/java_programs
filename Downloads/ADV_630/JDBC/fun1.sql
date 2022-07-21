
create or replace Function 
          FAdd(x number,y number)
                   return number
Is
   s number;
Begin
   s:=x+y;
   return s;
End FAdd;
/