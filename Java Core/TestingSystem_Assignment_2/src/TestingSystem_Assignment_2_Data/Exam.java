package TestingSystem_Assignment_2_Data;

import java.time.LocalDate;

public class Exam {
	int id;
    String code;
    String title;
    CategoryQuestion categoryId;
    int duration;
    Account account;
    LocalDate createDate;
    Question[] questions;
}
