#"Reading and Closing Files"
#absolute/relative directory of the file and mode "r, w, a, r+"
employee_file = open("employees.txt", "w")
#print(employee_file.readable())
#print(employee_file.read())

#print(employee_file.readline())
#print(employee_file.readline())

#print(employee_file.readlines())
#print(employee_file.readlines()[1])
#for employee in employee_file.readlines():
#print(employee_file.read())
#employee_file.close()

#Writing and appending to files on python
#appending is permanent and does not append to the next line but the current one
#employee_file.write("Toby - Human Resources")
#employee_file.write("\nKelly - Customer Services")
#print(employee_file.read())
#The w overrides the whole file and creates a new file
employee_file.write("\nKelly - Customer Services")
#using the write option with override the an existing file or create a new file
employee_file.write("\nJohn - Technician")
employee_file.close()

