declare i32 @getint()
declare void @putint(i32)
declare void @putch(i32)
declare i32 @getch()
declare void @memset(i32*, i32, i32)
declare i32 @getarray(i32*)
declare void @putarray(i32, i32*)
define dso_local i32 @main ( ){
   %l1 = alloca i32
   %l2 = alloca i32
   %l3 = alloca i32
   %l4 = alloca i32
   %l5 = alloca i32
   store i32 1,i32* %l3
   store i32 5, i32* %l1
   store i32 5, i32* %l2
   store i32 -2, i32* %l4
   store i32 2, i32* %l5
   br label %b1
b1:
   %t2 = load i32 , i32* %l1
   %t3 = load i32 , i32* %l2
   %t4 = add i32 %t2 , %t3
   %t5 = icmp eq i32 %t4 , 9
   br label %b4
b4:
   %t7 = load i32 , i32* %l1
   %t8 = load i32 , i32* %l2
   %t9 = sub i32 %t7 , %t8
   %t10 = icmp eq i32 %t9 , 0
   %t11 = load i32 , i32* %l5
   %t12 = icmp ne i32 %t11 , 4
   br i1 %t10, label %b5, label %b6
b5:
   %t13 = and i1 %t10, %t12
   br label %b6
b6:
   %t14 = phi i1 [false, %b4 ], [ %t13, %b5 ]
   br i1 %t5, label %b3, label %b2
b2:
   %t15 = or i1 %t5, %t14
   br label %b3
b3:
   %t16 = phi i1 [true, %b1 ], [ %t15, %b2 ]
   br i1 %t16, label %b7, label %b8
b7:
   %t17 = load i32 , i32* %l5
   %t18 = add i32 %t17 , 3
   store i32 %t18, i32* %l5
   br label %b9
b8:
   br label %b10
b10:
   %t20 = load i32 , i32* %l3
   %t21 = load i32 , i32* %l4
   %t22 = add i32 %t20 , %t21
   %t23 = icmp ne i32 %t22 , -1
   %t24 = load i32 , i32* %l5
   %t25 = add i32 %t24 , 1
   %t26 = srem i32 %t25 , 2
   %t27 = icmp eq i32 %t26 , 1
   br i1 %t23, label %b12, label %b11
b11:
   %t28 = or i1 %t23, %t27
   br label %b12
b12:
   %t29 = phi i1 [true, %b10 ], [ %t28, %b11 ]
   br i1 %t29, label %b13, label %b14
b13:
   %t30 = load i32 , i32* %l5
   %t31 = add i32 %t30 , 4
   store i32 %t31, i32* %l5
   br label %b14
b14:
   br label %b9
b9:
   %t32 = load i32 , i32* %l5
   call void @putint( i32 %t32 )
   ret i32 0
   ret i32 0
}

