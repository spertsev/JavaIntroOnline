https://github.com/Java0Tutor/3_Strings_and_basics_of_text_processing/blob/master/Practice%20(tasks).pdf

Работа с регулярными выражениями (Pattern, Matcher)
1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине; отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
2. Дана строка, содержащая следующий текст (xml-документ):
<notes>
<note id = "1">
<to>Вася</to>
<from>Света</from>
<heading>Напоминание</heading>
<body>Позвони мне завтра!</body>
</note>
<note id = "2">
<to>Петя</to>
<from>Маша</from>
<heading>Важное напоминание</heading>
<body/>
</note>
</notes>
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.