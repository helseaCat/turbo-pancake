CREATE TABLE cards(
    module_number INT NOT NULL,
    subject_title VARCHAR(50) NOT NULL,
    question_number INT NOT NULL,

    question_asked VARCHAR(50) NOT NULL,
    number_of_choices INT NOT NULL,
    number_of_correct_answers INT NOT NULL,

    true_or_false_answer BOOLEAN,
    true_or_false_choice BOOLEAN,

    multiple_choice_answer VARCHAR(50),

    multiple_choice_choice VARCHAR(50)
);