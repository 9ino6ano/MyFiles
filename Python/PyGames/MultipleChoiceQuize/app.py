#Multiple choice quize
from Questions import Question
question_prompts = [
    "What are the color of apples?\n(a) Red/Green\n(b) Blue/Purple\n(c) Yellow/Orange\n\n",
    "What are the color of bananas?\n(a) Red/Green\n(b) Blue/Purple\n(c) Yellow/Orange\n\n",
    "What are the color of strawberries?\n(a) Red/Green\n(b) Blue/Purple\n(c) Yellow/Orange\n\n"
]

questions = [
    Question(question_prompts[0], "a"),
    Question(question_prompts[1], "c"),
    Question(question_prompts[2], "b"),
]


def run_test(questions):
    score = 0
    for question in questions:
        answer = input(question.prompt)
        if answer == question.answer:
            score += 1
    print("Hey, You Got " + str(score) + " Out Of " + str(len(questions)) + " correct.")


run_test(questions)

