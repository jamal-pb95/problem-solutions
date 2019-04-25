some_marks = [2, 4, 6, 32, 60, 65, 69, 76, 80, 85, 90]

avg_marks = some_marks[4:8]
print(avg_marks)

good_marks = some_marks[8:]
print(good_marks)

poor_marks = some_marks[:4]
print(poor_marks)

another_marks = some_marks[2:9:3]
print(another_marks)

without_last_two_marks = some_marks[0: -2]
print(without_last_two_marks)

reverse_list = some_marks[::-1]
print(reverse_list)

min_marks = min(some_marks)
print(min_marks)

max_marks = max(some_marks)
print(max_marks)

sum_all_marks = sum(some_marks)
print(sum_all_marks)
