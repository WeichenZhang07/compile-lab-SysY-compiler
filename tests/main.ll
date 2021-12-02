; ModuleID = 'Test1.c'
source_filename = "Test1.c"
target datalayout = "e-m:e-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

@a = global [8 x i32] zeroinitializer, align 16
@b = constant [8 x i32] [i32 9, i32 2, i32 3, i32 4, i32 1, i32 5, i32 4, i32 0], align 16
@c = global [8 x i32] [i32 1, i32 2, i32 3, i32 4, i32 6, i32 3, i32 7, i32 8], align 16
@e = global [8 x i32] [i32 6, i32 7, i32 4, i32 5, i32 5, i32 6, i32 9, i32 10], align 16

; Function Attrs: noinline nounwind optnone uwtable
define i32 @main() #0 {
  %1 = alloca i32, align 4
  store i32 0, i32* %1, align 4
  %2 = load i32, i32* getelementptr inbounds ([8 x i32], [8 x i32]* @a, i64 0, i64 0), align 16
  %3 = load i32, i32* getelementptr inbounds ([8 x i32], [8 x i32]* @b, i64 0, i64 1), align 4
  %4 = add nsw i32 %2, %3
  %5 = load i32, i32* getelementptr inbounds ([8 x i32], [8 x i32]* @c, i64 0, i64 2), align 8
  %6 = add nsw i32 %4, %5
  %7 = load i32, i32* getelementptr inbounds ([8 x i32], [8 x i32]* @e, i64 0, i64 3), align 4
  %8 = add nsw i32 %6, %7
  %9 = call i32 (i32, ...) bitcast (i32 (...)* @putint to i32 (i32, ...)*)(i32 %8)
  store i32 2, i32* getelementptr inbounds ([8 x i32], [8 x i32]* @a, i64 0, i64 0), align 16
  store i32 3, i32* getelementptr inbounds ([8 x i32], [8 x i32]* @c, i64 0, i64 2), align 8
  %10 = load i32, i32* getelementptr inbounds ([8 x i32], [8 x i32]* @a, i64 0, i64 0), align 16
  %11 = load i32, i32* getelementptr inbounds ([8 x i32], [8 x i32]* @b, i64 0, i64 1), align 4
  %12 = add nsw i32 %10, %11
  %13 = load i32, i32* getelementptr inbounds ([8 x i32], [8 x i32]* @c, i64 0, i64 2), align 8
  %14 = add nsw i32 %12, %13
  %15 = load i32, i32* getelementptr inbounds ([8 x i32], [8 x i32]* @e, i64 0, i64 3), align 4
  %16 = add nsw i32 %14, %15
  %17 = call i32 (i32, ...) bitcast (i32 (...)* @putint to i32 (i32, ...)*)(i32 %16)
  ret i32 0
}

declare i32 @putint(...) #1

attributes #0 = { noinline nounwind optnone uwtable "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-jump-tables"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #1 = { "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false" }

!llvm.module.flags = !{!0}
!llvm.ident = !{!1}

!0 = !{i32 1, !"wchar_size", i32 4}
!1 = !{!"clang version 6.0.0-1ubuntu2 (tags/RELEASE_600/final)"}
