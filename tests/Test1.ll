declare i32 @getint()
declare void @putint(i32)
declare void @putch(i32)
declare i32 @getch()
declare void @memset(i32*, i32, i32)
declare i32 @getarray(i32*)
declare void @putarray(i32, i32*)
define dso_local i32 @add  (  i32 %t1 ,  i32 %t2 ){
   %l1 = alloca i32
   %l2 = alloca i32
   store i32 %t1 , i32* %l1
   store i32 %t2 , i32* %l2
   %t3 = load i32 , i32* %l1
   %t4 = load i32 , i32* %l2
   %t5 = add i32 %t3 , %t4
   ret i32 %t5
   ret i32 0
}
define dso_local i32 @main ( ){
   %l3 = alloca i32
   %l4 = alloca i32
   %l5 = alloca i32
   %l6 = alloca i32
   store i32 0, i32* %l3
   store i32 1, i32* %l4
   store i32 2, i32* %l5
   store i32 3, i32* %l6
   %t7 = load i32 , i32* %l5
   %t8 = icmp eq i32 %t7 , 0
   br label %b1
b1:
   br i1 %t8, label %b2, label %b4
b2:
   %t9 = load i32 , i32* %l4
   %t10 = icmp eq i32 %t9 , 0
   br label %b3
b3:
   br label %b4
   %t11 = and i1 %t8, %t10
b3:
b4:
   %t12 = phi i1 [false, %b1 ], [ %t11, %b3 ]
   br i1 %t11, label %b5, label %b6
b5:
   store i32 4, i32* %l6
   br label %b6
b6:
   %t13 = load i32 , i32* %l6
   ret i32 %t13
   ret i32 0
}

