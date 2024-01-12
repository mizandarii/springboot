import json
import random


with open('questions.json') as f:
    data =json.load(f)

    
questions = data['results']

correct_answers = data['results']
#print(correct_answers[0]['correct_answer'])

incorrect_answers = data['results']
#print(incorrect_answers[1]['incorrect_answers'])


answerNumbers = list(range(1, 5))
#print(answerNumbers)
n = 1
amount = len(questions)
for question in questions:
    print("Question " + str(i) + "/10: ")
    print(f"{n}/{amount}: {question['question']}")
    n += 1
    #print(questions[question]['question'])
    #print("Choose one of the following answers:")

    allAnswers = [] 
    allAnswers.append(question['question'])
    #correct_answers[0]['correct_answer']
    #random.shuffle(answerNumbers)
    #for j in range(1, 4):
    #    allAnswers.append(incorrect_answers[j]['incorrect_answers'])

    for a in question['incorrect_answers']:
        answers.append(a)
    random.shuffle(answers)
    print('Answers: \n\t', '\n\t'.join(answers), sep = '')





"""
currentQuestion = ""
questionNumbers = []

for i in questions:
    questionNumber = random.randint(0, 9)
    if questionNumber not in questionNumbers:
        questionNumbers.append(questionNumber)
        currentQuestion = questions[questionNumber]['question']
    else:
        continue
    print(currentQuestion)
"""
"""
for i in data:
    print(i["question"])
"""
