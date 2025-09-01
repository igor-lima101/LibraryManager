📚 Library Management System

A simple Library Management System implemented in Java.
This project allows users to manage a collection of books, register loans and returns, and search for books using their ISBN.

🎯 Features

Add books → Register new books with title, author, ISBN, and available quantity.

Remove books → Delete a book by its ISBN.

Search books → Find a book by ISBN.

Register loans → When a user borrows a book, the available quantity decreases.

Register returns → When a book is returned, the available quantity increases.

List all books → Display all books currently in the library.

📌 Rules

The system uses only HashMap<String, Book>, where the key is the ISBN.

If a user tries to borrow a book that does not exist or has no available copies → an error message is shown.

If a user tries to return a book that does not exist → an error message is shown.

🔑 Classes

Book → Represents a book (ISBN, title, author, available quantity).

Library → Manages the collection of books (add, remove, loan, return, search, list).

Main → Contains test cases and runs the program.
