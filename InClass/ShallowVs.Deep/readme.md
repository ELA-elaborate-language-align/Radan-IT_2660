 Show the contents of the original two objects.
tom: this person’s age is: 25
and their weight is: 187.6
mary: this person’s age is: 21
and their weight is: 127.3

Show contents after the shallow copy is made
tom: this person’s age is: 21
and their weight is: 127.3
mary: this person’s age is: 21
and their weight is: 127.3
tom and mary should have same contents.

Show contents after a change made to mary.
tom: this person’s age is: 22
and their weight is: 128.2
mary: this person’s age is: 22
and their weight is: 128.2
tom and mary still have same contents
even though we only changed mary!!

Show contents after a change made to tom.
tom: this person’s age is: 25
and their weight is: 187.6
mary: this person’s age is: 25
and their weight is: 187.6
tom and mary still have same contents
even though we only changed tom!!
Conclusion is that the shallow copy resulted in both
reference variables pointing at same object!

Show contents after the deep copy is made
tom: this person’s age is: 21
and their weight is: 127.3
mary: this person’s age is: 21
and their weight is: 127.3
tom and mary should have same contents.

Show contents after a change made to tom.
tom: this person’s age is: 25
and their weight is: 187.6
mary: this person’s age is: 21
and their weight is: 127.3
tom and mary now have different contents
and the change to tom did not affect mary

Show contents after a change made to mary.
tom: this person’s age is: 25
and their weight is: 187.6
mary: this person’s age is: 22
and their weight is: 128.2
tom and mary still have different contents
and the change to mary did not affect tom
Conclusion is that the deep copy resulted in each
reference variable pointing at different objects!
Show the contents of the original two objects.
tom: this person’s age is: 25
and their weight is: 187.6
mary: this person’s age is: 21
and their weight is: 127.3

Show contents after the shallow copy is made
tom: this person’s age is: 21
and their weight is: 127.3
mary: this person’s age is: 21
and their weight is: 127.3
tom and mary should have same contents.

Show contents after a change made to mary.
tom: this person’s age is: 22
and their weight is: 128.2
mary: this person’s age is: 22
and their weight is: 128.2
tom and mary still have same contents
even though we only changed mary!!

Show contents after a change made to tom.
tom: this person’s age is: 25
and their weight is: 187.6
mary: this person’s age is: 25
and their weight is: 187.6
tom and mary still have same contents
even though we only changed tom!!
Conclusion is that the shallow copy resulted in both
reference variables pointing at same object!

Show contents after the deep copy is made
tom: this person’s age is: 21
and their weight is: 127.3
mary: this person’s age is: 21
and their weight is: 127.3
tom and mary should have same contents.

Show contents after a change made to tom.
tom: this person’s age is: 25
and their weight is: 187.6
mary: this person’s age is: 21
and their weight is: 127.3
tom and mary now have different contents
and the change to tom did not affect mary

Show contents after a change made to mary.
tom: this person’s age is: 25
and their weight is: 187.6
mary: this person’s age is: 22
and their weight is: 128.2
tom and mary still have different contents
and the change to mary did not affect tom
Conclusion is that the deep copy resulted in each
reference variable pointing at different objects!
