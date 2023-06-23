package TestingSystem_Assignment_2_Data;
import java.time.LocalTime;



public class Question {
	int id;
	String content;
	CategoryQuestion categoryId; 
	TypeQuestion typeId;
	Account creatorId;
	LocalTime createDate;
	Exam[] exams;
}