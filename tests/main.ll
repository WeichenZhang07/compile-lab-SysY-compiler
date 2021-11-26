declare i32 @getint()
declare void @putint(i32)
declare void @putch(i32)
declare i32 @getch()
define dso_local i32 @main () {
   %l1 = alloca i32
   %l2 = alloca i32
   store i32 56, i32* %l1
   store i32 4, i32* %l2
   %t1 = load i32, i32* %l1
   %t2 = sub i32 %t1, -4
   %t3 = load i32, i32* %l2
   %t4 = add i32 %t2, %t3
   store i32 %t4, i32* %l1
   %t5 = load i32, i32* %l1
   %t6 = icmp eq i32 %t5, 0
   %t7 = icmp eq i1 %t6, 0
   %t8 = icmp eq i1 %t7, 0
   %t9 = zext i1 %t8 to i32
   %t10 = sub i32 0, %t9
   %t11 = trunc i32 %t10 to i1
   br i1 %t11, label %t12, label %t13
t12:
   store i32 -1, i32* %l1
   br label %t14
t13:
   %t15 = load i32, i32* %l2
   %t16 = add i32 0, %t15
   store i32 %t16, i32* %l1
   br label %t14
t14:
   %t17 = load i32, i32* %l1
   call void @putint (i32 %t17)
   ret i32 0
}

