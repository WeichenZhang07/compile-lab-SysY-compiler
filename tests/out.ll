declare i32 @getint()
declare void @putint(i32)
declare void @putch(i32)
declare i32 @getch()
define dso_local i32 @main () {
   %l1 = alloca i32
   %l2 = alloca i32
   %l3 = alloca i32
   store i32 1,i32* %l3
   %l4 = alloca i32
   %l5 = alloca i32
   store i32 5, i32* %l1
   store i32 5, i32* %l2
   store i32 2, i32* %l4
   store i32 2, i32* %l5
   %t1= load i32, i32* %l1
   %t2= load i32, i32* %l2
   %t3 = add i32 %t1, %t2
   %t4= load i32, i32* %l3
   %t5 = add i32 %t3, %t4
   %t6= load i32, i32* %l4
   %t7 = add i32 %t5, %t6
   %t8 = icmp eq i32 %t7, 10
   br i1 %t8, label %t9, label %t10
%t9:
   %t12= load i32, i32* %l5
   %t13 = add i32 %t12, 1
   store i32 %t13, i32* %l5
%t10:
   %t14= load i32, i32* %l1
   %t15= load i32, i32* %l2
   %t16 = add i32 %t14, %t15
   %t17= load i32, i32* %l3
   %t18 = add i32 %t16, %t17
   %t19= load i32, i32* %l4
   %t20 = add i32 %t18, %t19
   %t21 = icmp eq i32 %t20, 8
   br i1 %t21, label %t22, label %t23
%t22:
   %t25= load i32, i32* %l5
   %t26 = add i32 %t25, 2
   store i32 %t26, i32* %l5
%t23:
   %t27= load i32, i32* %l5
   %t28 = add i32 %t27, 4
   store i32 %t28, i32* %l5
%t24:
%t11:
   %t29= load i32, i32* %l5
   call void @putint (i32 %t29)
   ret i32 0
}

