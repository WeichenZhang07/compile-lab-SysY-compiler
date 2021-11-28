declare i32 @getint()
declare void @putint(i32)
declare void @putch(i32)
declare i32 @getch()
define dso_local i32 @main () {
   %t1 = call i32 @getint ()
   %l1 = alloca i32
   store i32 %t1,i32* %l1
   %l2 = alloca i32
   store i32 65,i32* %l2
   %l3 = alloca i32
   store i32 67,i32* %l3
   %l4 = alloca i32
   store i32 87,i32* %l4
   %l5 = alloca i32
   store i32 10,i32* %l5
   br i1 0, label %b1, label %b2
b1:
   br label %b3
b3:
   br i1 1, label %b4, label %b5
b4:
   br label %b3
b5:
   br label %b2
b2:
   br i1 1, label %b6, label %b7
b6:
   %l6 = alloca i32
   store i32 1,i32* %l6
   br label %b9
b9:
   %t2 = load i32, i32* %l6
   %t3 = load i32, i32* %l1
   %t4 = icmp slt i32 %t2 , %t3
   br i1 %t4, label %b10, label %b11
b10:
   %t5 = load i32, i32* %l2
   call void @putch (i32 %t5)
   call void @putch (i32 67)
   %t6 = load i32, i32* %l5
   call void @putch (i32 %t6)
   %t7 = load i32, i32* %l6
   %t8 = add i32 %t7 , 1
   store i32 %t8, i32* %l6
   br label %b9
b11:
   br label %b8
b7:
   %l7 = alloca i32
   store i32 1,i32* %l7
   br label %b12
b12:
   %t9 = load i32, i32* %l7
   %t10 = load i32, i32* %l1
   %t11 = icmp slt i32 %t9 , %t10
   br i1 %t11, label %b13, label %b14
b13:
   %t12 = load i32, i32* %l4
   call void @putch (i32 %t12)
   %t13 = load i32, i32* %l2
   call void @putch (i32 %t13)
   %t14 = load i32, i32* %l5
   call void @putch (i32 %t14)
   br label %b12
b14:
   br label %b8
b8:
   %l8 = alloca i32
   store i32 1,i32* %l8
   br label %b15
b15:
   %t15 = load i32, i32* %l8
   %t16 = load i32, i32* %l1
   %t17 = icmp sle i32 %t15 , %t16
   br i1 %t17, label %b16, label %b17
b16:
   %t18 = load i32, i32* %l2
   call void @putch (i32 %t18)
   %t19 = load i32, i32* %l3
   call void @putch (i32 %t19)
   %t20 = load i32, i32* %l8
   %t21 = add i32 %t20 , 1
   store i32 %t21, i32* %l8
   br label %b15
b17:
   ret i32 0
}

