declare i32 @getint()
declare void @putint(i32)
declare void @putch(i32)
declare i32 @getch()
define dso_local i32 @main () {
%l1 = alloca i32
%l2 = alloca i32
store i32 1,i32* %l1
br label %b1
b1:
%t1 = load i32, i32* %l1
%t2 = icmp slt i32 %t1 , 12
br i1 %t2, label %b2, label %b3
b2:
store i32 0,i32* %l2
br label %b4
b4:
br i1 1, label %b5, label %b6
b5:
%t3 = load i32, i32* %l2
%t4 = srem i32 %t3 , 3
%t5 = icmp eq i32 %t4, 1
br i1 %t5, label %b7, label %b8
b7:
call void @putch (i32 49)
br label %b9
b8:
call void @putch (i32 48)
br label %b9
b9:
%t6 = load i32, i32* %l2
%t7 = add i32 %t6 , 1
store i32 %t7, i32* %l2
%t8 = load i32, i32* %l2
%t9 = load i32, i32* %l1
%t10 = mul nsw i32 2 , %t9
%t11 = sub i32 %t10 , 1
%t12 = icmp sge i32 %t8 , %t11
br i1 %t12, label %b10, label %b11
b10:
br label %b6
br label %b11
b11:
br label %b4
b6:
call void @putch (i32 10)
%t13 = load i32, i32* %l1
%t14 = add i32 %t13 , 1
store i32 %t14, i32* %l1
br label %b1
br label %b1
b3:
ret i32 0
}

