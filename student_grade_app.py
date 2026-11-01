def calculate_total(score):
    total = 0
    for index in range(len(score)):
        total += score[index]
    return total


def calculate_average(total, subjects):
    return total / subjects


def calculate_position(student, total):
    position = 1
    for index in range(len(total)):
        if total[index] > total[student]:
            position += 1
    return position


student_number = int(input("How many students do you have? "))
subject_number = int(input("How many subjects do they offer? "))

if student_number <= 0 or subject_number <= 0:
    print("Students and subjects must be greater than zero.")

else:
    print("\nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    print("Saved successfully!")

    score = [[0 for subject in range(subject_number)]
             for student in range(student_number)]

    total = [0] * student_number
    average = [0] * student_number

    for student in range(student_number):

        print("\nEntering scores for student " + str(student + 1))

        for subject in range(subject_number):

            while True:
                try:
                    mark = int(input("Enter score for subject " + str(subject + 1) + ": "))

                    if 0 <= mark <= 100:
                        score[student][subject] = mark
                        break
                    else:
                        print("Enter a score between 0 and 100.")

                except ValueError:
                    print("Please enter a valid whole number.")

        total[student] = calculate_total(score[student])

        average[student] = calculate_average(total[student], subject_number )

    print("\n==========================================")

    print("STUDENT", end="\t")

    for subject in range(subject_number):
        print("SUB" + str(subject + 1), end="\t")

    print("TOT\tAVE\tPOS")
    print("============================================")
    for student in range(student_number):

        print(student + 1, end="\t")

        for subject in range(subject_number):
            print(score[student][subject], end="\t")

        position = calculate_position(student, total)

        print(str(total[student]) + "\t" + format(average[student], ".2f") + "\t" + str(position))

    print("=============================================")
    print()
    print("=============================================")
