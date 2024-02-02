import json
import random
import html 

with open('json\questions.json') as f:
    data=json.load(f)
questions=data['results']


n = 1
rightAnswers = 0
amount = len(questions)
for question in questions:
    print(f"{n}/{amount}: {html.unescape(question['question'])}")
    n += 1
    answers = []
    answers.append(html.unescape(question['correct_answer']))
    for j in question['incorrect_answers']:
        answers.append(html.unescape(j))
    random.shuffle(answers)
    print('Answers:\n\t', '\n\t'.join(answers), sep='')

    #print("-------correct answer: "+ question['correct_answer'])

    answer = input('Put your answer here: ')

    if answer.lower().strip() == question['correct_answer'].lower().strip():
        print('Correct')
        rightAnswers += 1
        print("Right answers total: " + str(rightAnswers))
        print("----------------------------------------------------------")
    else:
        print(f"Incorrect: {html.unescape(question['correct_answer'])}")
        print("Right answers total: " + str(rightAnswers))
        print("----------------------------------------------------------")
        

print(f"Quiz is over. Total score: {rightAnswers}/{amount}")
