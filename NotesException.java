/*Exception handling
 * 1. checked-compile time(file not ,class not,sql) , Unchecked-Run time(art, nullpointer,arrayoutofbonds)
 *    the statements where the user may give wrong inputs we need to identify that and need to keep in try block.
 * 2. Try block will not handle the exception. Jvm will identify the exception and gives that to the try block.
 * 3. Try block will throw the exception to the catch block. In try block there is an exception in 5th line, from there 
 *     onwards the after lines will not execute. Hierarchy should be maintained.For one try blocjk we can write n number
 *     of catch blocks.
 * 4. If there is the catch block that handles the try block exception then only the exception will be handled.
 * 5. Exception is the parent of all the child exceptions. So if we are not clear about the paticular exception we use
 *    Exception.Parent Exception should be in the last line in the catch block. Child exceptions will come first.If it 
 *    is in the first line then it will take the parent block will catch all exceptions, including those that are 
 *    instances of its child classes. This means that the specific catch blocks become unreachable code since the
 *    parent has already catch them. This results in compile time error(unreachable code). Hierarchy must be followed.
 * 6. After try block we can write catch or finally block. With out try we can't write catch or finally. 
 * 7. If there is exception then only the catch block executes. If there is no exception then try and finally executes 
 *    but catch will not executes.
 * 8. Finally executes whether the exception occurs or not.Finally is not mandatory block.Finally is used to clean up
 *    resources like files and DataBase connections.
 * 9 . We write the so many exceptions in same catch block. Using pipe symbol.
 *     catch(ArrayoutOfBondsException | ClassNotFoundException){}. So like this we can't give Exception here because 
 *     ArrayoutOfBondsException is also present in Exception. So it will give as duplicate code.

 *   Example
 *   In an instagram account we are given the mail and the password in the front end and that is taken to the back end 
 *   which is connected to the database. In that data base it will check if it is matching details are avilable then the
 *   information is given to the front end.
 *   Suppose the user details not found then that time the user not found exception will rise. these are customized 
 *   exceptions.WE need to forcefully need to raise the custom exception. same we write as "UserNotFound extends Exception"
 *   If we want to create runtime exception then public class UserNotFound extends Runtimeexception.
 *   Throw is used to throw the expection . If there is no exception then it will create an exception and throw it.
 *   custom exceptions extends both checked(Exception) and unchecked exception(Runtimeexception).
 *   IN a method we are using throw keyword and throwing the checked exception(Excepetion) like then we need to definately
 *   use throws keyword. otherwise it will gives compile time error.If there is run time no need of throws.
 *   Throws is used to declare the exception in main head. why we are using throws for checked exceptions means the user 
 *   who is going to use the code further we need to indicate using throws the exception may arrive that too checked exception
 *   and need to handle it using try and catch.
 *   For run time the exception  it may cause or not cause.the user may five the correct inputs so for that reason throws is 
 *   not mandetiory for runtime exceptions. No need to handle.
 *   throw the checked exception definately have to use throws. If throws is used then throw is mandatory to use.
 *   if we have 4 method m1,m2,m3 and m4. If m1 have exception that is handled in m4 becase the m2 and m3 should know
 *   that the exception is there . If it is handled in m2 then the m3 and m4 nor able to understand and it gets errors.
 */
 