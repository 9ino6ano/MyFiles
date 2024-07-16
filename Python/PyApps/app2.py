#This is a modified version of the program
from questions import question
question_prompts = [
#These are python questions [Beginner]
    "Which symbol is used for comments in Python:\n(a) //\n(b) --\n(c) #\n(d) /**/\n\n",
    "How do you print 'Hello,World' to the console on Python:\n(a) print('Hello,World')\n(b) echo 'Hello,World'\n(c) console.log('Hello,World')\n(d) display('Hello,World')\n\n",
    "Which of the following is a correct way to declare a variable in Python:\n(a) variable x = 10\n(b) x = 10\n(c) int x = 10\n(d) let x = 10\n\n",
    "How do you check the length of a list named 'my_list' in Python:\n(a) size(my_list)\n(b) len(my_list)\n(c) length(my_list)\n(d) count(my_list)\n\n",
    "What is the correct syntax for a multi-line comment in Python:\n(a) /*This is a comment*/ \n(b) //This is a comment//\n(c) 'This is a comment'\n(d) #This is a comment#\n\n",
#These are networking questions [Beginner]
    "What does the acronym 'LAN' stand for in networking:\n(a) Local Area Network\n(b) Large Area Network\n(c) Longitudinal Access Network\n(d) Limited Access Node\n\n",
    "Which protocol is commonly used for email communication in networking: \n(a) HTTP\n(b) FTP\n(c) SMTP\n(d) UDP\n\n",
    "What does DNS stand for in networking:\n(a) Data Naming System\n(b) Domain Name System\n(c) Dynamic Network Service\n(d) Digital Network Security\n\n",
    "In the OSI model, which layer is responsible for logical addressing, such as IP addresses:\n(a) Network Layer\n(b) Data-Link Layer\n(c) Transport Layer\n(d) Presentation Layer\n\n",
    "What device is used to connect multiple computers in a local network and operates at the Data Link Layer: \n(a) Router\n(b) Switch\n(c) Hub\n(d) Moderm\n\n",
#These are database questions [Beginner]
    "What is the primary responsibility of a database administrator (DBA):\n(a) Writing code for apps\n(b) Designing User Interface\n(c) Managing and Maintaining Databases\n(d) Conduct market research\n\n",
    "Which of the following is NOT a type of database model:\n(a) Relational Database Model\n(b) Hierachiel Database Model\n(c) Network Database Model\n(d) Linear Database Model\n\n",
    "What does SQL stand for:\n(a) Simple Query Langauge\n(b) Structured Question Langauge\n(c) Standard Query Langauge\n(d) System Query Logic\n\n",
    "In a relational database, what is a primary key:\n(a) A key used for encryption\n(b) A unique identifier for a record in a table\n(c) A Key used to access the database\n(d) A foreign key from another table\n\n",
    "What is the purpose of database normalization:\n(a) Increasing redundancy in the database\n(b) Improving performance by adding more data\n(c) Reduce redundancy and dependency in the database\n(d) Adding complexity to the database schema\n\n",
#These are business questions [Beginner]
    "What is the primary goal of business analysis:\n(a) Increase sales\n(b) Maximize Profit\n(c) Understand business needs and find solutions\n(d) Improve employee satisfaction\n\n",
    "Which technique is commonly used for gathering requirements by observing how users perform their tasks:\n(a) Interviews\n(b) Surveys\n(c) Use cases\n(d) Observation\n\n",
    "What does SWOT analysis stand for:\n(a) Software Work and Operational Tasks\n(b) Strengths,Weakness,Threats,Opportunities\n(c) Strategic Ways of Organizing Teams\n(d) Systematic workflow for organizing tasks\n\n",
    "Which document outlines the scope, objectives and constraints of a project and is used to gain approval from stakeholders:\n(a) Business Case\n(b) Requirements Document\n(c) Project Charter\n(d) Risk Management Plan\n\n",
    "In the context of business analysis, what is the purpose of a Use Case:\n(a) Increasing redundancy in a database\n(b) Improving performance by adding more data\n(c) Reducing redundancy and dependency in a database\n(d) Adding complexity to the database schema\n\n",
#############################################
#[Here is a subset of intermediate questions]
#Python Intermediate Questions
    "What is the purpose of the __init__ method in a Python class:\n(a) To initialize the class attributes\n(b) To define the class constructor\n(c) To create a new instance of the class\n(d) To perform cleanup operations\n\n",
    "What is the difference between a shallow copy and a deep copy in Python:\n(a) Shallow copy duplicates the object, but not its nested objects\n(b) Deep copy duplicates the object and all of its nested objects\n(c) Shallow copy is faster than deep copy\n(d) All of the above.\n\n",
    "What is the purpose of the super() function in Python:\n(a) It calls the superclass's constructor.\n(b) It returns the superclass object.\n(c) It is used to access the parent class's methods and properties\n(d) All of the above.\n\n",
    "How is exception handling implemented in Python:\n(a) Using try, except, finally blocks\n(b) Using raise keyword\n(c) Using assert statement\n(d) All of the above\n\n",
    "What is the purpose of the async and await keywords in Python:\n(a) They are used for defining asynchronous functions and operations \n(b) They are used for error handling in asynchronous code\n(c) They define decorators for asynchronous code\n(d) They are used for defining generator functions\n\n",
#Network Intermediate Questions
    "What is the purpose of the OSI model in networking:\n(a) To define the structure of the internet\n(b) To standardize network protocols and communication\n(c) To specify the hardware components of a network\n(d) To provide a framework for cybersecurity\n\n",
    "What is the difference between TCP (Transmission Control Protocol) and UDP (User Datagram Protocol):\n(a) TCP is connectionless, while UDP is connection-oriented.\n(b) TCP provides reliable, ordered delivery of data, while UDP does not guarantee delivery.\n(c) TCP is faster than UDP for real-time applications\n(d) UDP is more secure than TCP\n\n",
    "What is the purpose of BGP (Border Gateway Protocol) in routing:\n(a) To manage internal routing within a network\n(b) To connect devices within the same local area network\n(c) To exchange routing and reachability information between autonomous systems\n(d) To provide security at the network layer\n\n",
    "What is VLAN (Virtual Local Area Network):\n(a) A physical network separated into different segments\n(b) A logical network created within a physical network\n(c) A type of network cable\n(d) A security protocol for wireless networks\n\n",
    "What is the purpose of Quality of Service (QoS) in networking:\n(a) To improve the speed of data transmission\n(b) To prioritize certain types of network traffic over others\n(c) To enhance network security\n(d) To prevent network congestion\n\n",
#Database Intermediate Questions
    "What is the purpose of database normalization:\n(a) To reduce the redundancy of data and dependency between tables\n(b) To increase the size of the database\n(c) To improve data encryption\n(d) To speed up database queries\n\n",
    "In the context of database transactions, what is the meaning of ACID properties:\n(a)  Atomicity, Consistency, Isolation, Durability\n(b) Aggregation, Compression, Indexing, Deletion\n(c) Access, Concurrency, Integration, Deployment\n(d) Association, Caching, Inheritance, Documentation\n\n",
    "What is the purpose of an SQL JOIN operation:\n(a) To create a new table in the database\n(b) To retrieve data from multiple tables based on a related column\n(c) To delete records from a table\n(d) To perform complex mathematical operations on database fields\n\n",
    "What is the role of a database index:\n(a) To encrypt data in the database\n(b) To enforce data integrity constraints\n(c) To speed up data retrieval by providing a quick access path to rows in a table\n(d) To define relationships between tables\n\n",
    "In a relational database, what is the purpose of the FOREIGN KEY constraint:\n(a) To ensure that a column can only contain unique values \n(b) To specify a default value for a column\n(c) To establish a link between two tables based on a column\n(d) To enforce the primary key constraint\n\n",
#Business Intermediate Questions
    "What is the purpose of a SWOT analysis in business analysis:\n(a) To identify software development methodologies\n(b) To assess the Strengths, Weaknesses, Opportunities, and Threats of a business\n(c) To create a project charter\n(d) To evaluate financial statements\n\n",
    "What is the significance of a Fishbone diagram in business analysis:\n(a) It represents a hierarchical structure of business processes\n(b) It is used for identifying potential causes of problems or issues\n(c)  It visualizes the flow of data within an organization\n(d) It defines the scope and objectives of a project\n\n",
    "In the context of business process modeling, what does BPMN stand for:\n(a) Business Process Model and Notation\n(b) Business Performance Measurement Network\n(c) Business Project Management Nexus\n(d) Business Protocol Management Node\n\n",
    "What is the purpose of a Use Case Diagram in business analysis:\n(a) To model the interactions between business processes\n(b) To represent the flow of data within a system\n(c) To visualize how a system interacts with external entities\n(d) To define the user interface of a software application\n\n",
    "What is the role of a Business Analyst in the Agile methodology:\n(a) To create a detailed project plan\n(b) To facilitate communication between stakeholders and the development team\n(c) To perform all coding and programming tasks\n(d) To conduct market research and competitive analysis\n\n",
##############################################
#THese are Rockstar questions
#These are python questions [Rockstar]
    "What is the purpose of a Python decorator:\n(a) Decorator is used for string manipulation\n(b) To add extra functionality to a function or a method\n(c) To remove unnecessary code from a Python script\n(d) To create a graphical user interface for a Python application\n\n",
    "What is the purpose of the asyncio module in Python:\n(a) To create asynchronous I/O operations for more efficient network programming\n(b) To automate testing of Python applications\n(c) To generate random numbers in Python\n(d) To create a graphical user interface for a Python application\n\n",
    "What is the purpose of the contextlib module in Python:\n(a)To handle exceptions in a more concise way\n(b) To provide context managers for resource management using the with statement\n(c) To create decorators for functions\n(d) A contextlib is a module, that contains functions which can be executed only once\n\n",
    "What is the purpose of the __slots__ attribute in a Python class:\n(a) To define slots or spaces for storing variables in a class\n(b) To handle exceptions in a more concise way.\n(c) To restrict the creation of new attributes in instances of a class\nto only those listed in __slots__, reducing memory usage\n(d) To indicate that a class should be treated as a slot machine\n\n",
    "Explain the difference between Python's map() and filter() functions:\n(a) map() is used to transform each element of an iterable using a given function,\nwhile filter() is used to remove elements from an iterable based on a given condition\n(b) map() and filter() are two names for the same function\n(c) map() is used to create a map of the elements in an iterable,\nwhile filter() is used to filter out specific values\n(d) To provide context managers for\nresource management using the with statement\n\n",
#These are networking questions [Rockstar]
    "What is the purpose of the TTL (Time To Live) field in the IP header:\n(a) It specifies the total time a packet can be in the network\n(b) It determines the maximum transmission speed of a network\n(c) It sets the timeout for TCP connections\n(d) It defines the maximum number of hops a packet can take before being discarded\n\n",
    "What is the difference between ICMP and IGMP:\n(a) ICMP is used for routing decisions, while IGMP is used for error reporting\n(b) ICMP is a network layer protocol, while IGMP operates at the transport layer'\n(c) ICMP is used for diagnosing network issues, while IGMP is used for\nmanaging multicast group memberships\n(d) ICMP is a connection-oriented protocol, while IGMP is connectionless\n\n",
    "What is the purpose of a subnet mask:\n(a) To identify the network portion of an IP address\n(b) To provide encryption for network traffic\n(c) To prevent IP address conflicts\n(d) To allocate IP addresses to devices in a network\n\n",
    "What is the significance of the 802.1Q standard in networking:\n(a) It defines the format of IP packets\n(b) It specifies the method for subnetting IP addresses\n(c)  It is a standard for VLAN tagging in Ethernet frames\n(d) It establishes the rules for routing between autonomous systems\n\n",
    "What is a DDoS attack:\n(a) A Denial of Service attack launched by a single attacker\n(b) A Distributed Denial of Service attack involving multiple compromised systems\n(c) A Data Distribution over Subnetwork attack\n(d) A Dynamic Domain Overloading System attack\n\n",
#These are Database question [Rockstar]
    "What does it mean to denormalize a database:\n(a) To make data more complicated\n(b) To remove redundancy and make queries faster\n(c) To organize data into neat tables\n(d) To create a mix of data like a cocktail\n\n",
    "In simple terms, what's the purpose of a database transaction:\n(a) It's like a secret mission for data\n(b) To ensure data changes happen completely or not at all\n(c) To remove redundancy and make queries faster\n(d) To speed up data entry\n\n",
    "What's the role of a primary key in a database:\n(a) It's the boss key to access all the data\n(b) To identify each record uniquely in a table\n(c) To encrypt sensitive information\n(d) To organize data into neat tables\n\n",
    "What is the main purpose of a database index:\n(a) To store secret codes securely\n(b) To speed up finding and fetching specific information quickly\n(c) To organize data in alphabetical order\n(d) To retrieve information spread across different tables\n\n",
    "What is the purpose of database normalization:\n(a) Database normalization is the process of creating redundant tables to improve data integrity\n(b) Database normalization is the process of organizing data to reduce redundancy\nand dependency by dividing large tables into smaller, related tables\n(c) Database normalization is the practice of creating\na single table for all data to simplify query operations\n(d) Database normalization is a technique for\nindexing tables to speed up data retrieval\n\n",
#These are Business question [Rockstar]
    "What is the significance of a Fishbone diagram in business analysis:\n(a) It represents a hierarchical structure of business processes\n(b)  It is used for identifying potential causes of problems or issues\n(c) It visualizes the flow of data within an organization\n(d) It defines the scope and objectives of a project\n\n",
    "What is the role of data governance in an organization:\n(a) To restrict access to data, ensuring only a select few individuals can use it\n(b) To define the policies, procedures, and standards for managing and using data\n(c) To collect and store large volumes of data without any specific guidelines\n(d) To delegate data management responsibilities solely to the IT department\n\n",
    "What is the critical path in project management:\n(a) The path with the shortest duration for project completion\n(b) The sequence of tasks that must be completed for the project to finish on time\n(c) The path with the most critical tasks requiring extra attention\n(d) The longest sequence of tasks determining the minimum time needed for project completion\n\n",
    "Which technique is commonly used for root cause analysis in problem-solving: \n(a) SWOT analysis\n(b) Fishbone diagram (Ishikawa diagram)\n(c) PERT analysis\n(d) Force field analysis\n\n",
    "What is the difference between a mission statement and a vision statement in strategic planning:\n(a) A mission statement outlines long-term goals,\nwhile a vision statement focuses on short-term objectives\n(b) A mission statement defines the purpose and values of an organization,\nwhile a vision statement describes its future aspirations\n(c) A mission statement is specific to marketing strategies,\nwhile a vision statement is related to financial planning\n(d) A mission statement is only relevant for non-profit organizations,\nwhile a vision statement is for profit-driven entities\n\n",

]
print("Path Pioneer [Networking and Mentorship Program]")
print("________________________________________________")
name = input("Please enter your name: ")
print("What's up? "+ name + " welcome to the Path Pioneer.\n")
print("We wil take on journey to measure your skill's from [Beginner] to [Expert]\n")
email = input("To stay up to date with current trends in technology\nPlease enter your email: ")
print("If you complete all neccessary skill's assessments,\nWe will provide you with an opportunity using\n["+email+"] -> to meet our Field Agents & Mentors.")
print()
print(name+", Please select a field to explore from the list below:\n[Python]\t[Network]\n[Database]\t[Business]")
Field = input("I Choose : ")
print("________________________________________________")
try:
    if (Field.upper()) == "PYTHON":
        print(
            name + ", You have selected " + Field + ".\nComplete the multiple questions\nwith a score of 70% or more inorder to continue to the next level.\n")
        print("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n")
        print("Skills Rating:\n[Beginner]\t[Intermediate]\t[Rockstar]\n")
        Expert_level = input("Please tell us your level of expertise on " + Field + "ing : ")
        print("================================================\n")
        if (Expert_level.upper()) == "BEGINNER":
            print("You have rated yourself as a " + Expert_level + ".\n")
            questions = [
                question(question_prompts[0], "c"),
                question(question_prompts[1], "a"),
                question(question_prompts[2], "b"),
                question(question_prompts[3], "b"),
                question(question_prompts[4], "c"),
            ]
        elif (Expert_level.upper()) == "INTERMEDIATE":
            print("You have rated yourself as an " + Expert_level + ".\n")
            questions = [
                question(question_prompts[20], "b"),
                question(question_prompts[21], "a"),
                question(question_prompts[22], "a"),
                question(question_prompts[23], "d"),
                question(question_prompts[24], "a"),
            ]
        elif (Expert_level.upper()) == "ROCKSTAR":
            print("You have rated yourself as a " + Expert_level + ".\n")
            questions = [
                question(question_prompts[40], "a"),
                question(question_prompts[41], "a"),
                question(question_prompts[42], "b"),
                question(question_prompts[43], "c"),
                question(question_prompts[44], "a"),
            ]
        else:
            print("")

    elif (Field.upper()) == "NETWORK":
        print(
            name + ", You have selected Networks.\nComplete the multiple questions\nwith a score of 70% or more inorder to continue the course.\n")
        print("<><><><><><><><><><><><><><><><><><><><><><><><>\n")
        print("Skills Rating:\n[Beginner]\t[Intermediate]\t[Rockstar]\n")
        Expert_level = input("Please tell us your expert level on " + Field + "ing : ")
        print("================================================\n")
        if (Expert_level.upper()) == "BEGINNER":
            print("You have rated yourself as a " + Expert_level + ".\n")
            questions = [
                question(question_prompts[5], "a"),
                question(question_prompts[6], "c"),
                question(question_prompts[7], "b"),
                question(question_prompts[8], "a"),
                question(question_prompts[9], "b"),
            ]
        elif (Expert_level.upper()) == "INTERMEDIATE":
            print("You have rated yourself as an " + Expert_level + ".\n")
            questions = [
                question(question_prompts[25], "b"),
                question(question_prompts[26], "b"),
                question(question_prompts[27], "c"),
                question(question_prompts[28], "b"),
                question(question_prompts[29], "b"),
            ]
        elif (Expert_level.upper()) == "ROCKSTAR":
            print("You have rated yourself as a " + Expert_level + ".\n")
            questions = [
                question(question_prompts[45], "a"),
                question(question_prompts[46], "a"),
                question(question_prompts[47], "b"),
                question(question_prompts[48], "c"),
                question(question_prompts[49], "c"),
            ]
    elif (Field.upper()) == "DATABASE":
        print(
            name + ", You have selected Databases.\nComplete the multiple questions\nwith a score of 60% or more inorder to continue the course.\n")
        print("|_-_|_-_|_-_|_-_|_-_|_-_|_-_|_-_|_-_|_-_|_-_|_-|\n")
        print("Skills Rating:\n[Beginner]\t[Intermediate]\t[Rockstar]\n")
        Expert_level = input("Please tell us your expert level on " + Field + "s : ")
        print("================================================\n")
        if (Expert_level.upper()) == "BEGINNER":
            print("You have rated yourself as a " + Expert_level + ".\n")
            questions = [
                question(question_prompts[10], "c"),
                question(question_prompts[11], "b"),
                question(question_prompts[12], "c"),
                question(question_prompts[13], "d"),
                question(question_prompts[14], "c"),
            ]
        elif (Expert_level.upper()) == "INTERMEDIATE":
            print("You have rated yourself as an " + Expert_level + ".\n")
            questions = [
                question(question_prompts[30], "a"),
                question(question_prompts[31], "a"),
                question(question_prompts[32], "b"),
                question(question_prompts[33], "c"),
                question(question_prompts[34], "c"),
            ]
        elif (Expert_level.upper()) == "ROCKSTAR":
            print("You have rated yourself as a " + Expert_level + ".\n")
            questions = [
                question(question_prompts[50], "b"),
                question(question_prompts[51], "b"),
                question(question_prompts[52], "b"),
                question(question_prompts[53], "b"),
                question(question_prompts[54], "d"),
            ]

    elif (Field.upper()) == "BUSINESS":
        print(
            name + ", You have selected Business Analysis.\nComplete the multiple questions\nwith a score of 80% or more inorder to meet a professional mentor.\n")
        print("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n")
        print("Skills Rating:\n[Beginner]\t[Intermediate]\t[Rockstar]\n")
        Expert_level = input("Please tell us your expert level on " + Field + "es : ")
        print("================================================\n")
        if (Expert_level.upper()) == "BEGINNER":
            print("You have rated yourself as a " + Expert_level + ".\n")
            questions = [
                question(question_prompts[15], "c"),
                question(question_prompts[16], "d"),
                question(question_prompts[17], "b"),
                question(question_prompts[18], "c"),
                question(question_prompts[19], "b"),
            ]
        elif (Expert_level.upper()) == "INTERMEDIATE":
            print("You have rated yourself as a " + Expert_level + ".\n")
            questions = [
                question(question_prompts[35], "b"),
                question(question_prompts[36], "b"),
                question(question_prompts[37], "a"),
                question(question_prompts[38], "c"),
                question(question_prompts[39], "b"),
            ]
        elif (Expert_level.upper()) == "ROCKSTAR":
            print("You have rated yourself as a " + Expert_level + ".\n")
            questions = [
                question(question_prompts[56], "b"),
                question(question_prompts[57], "b"),
                question(question_prompts[58], "d"),
                question(question_prompts[59], "b"),
                question(question_prompts[60], "b"),
            ]
    else:
        print("You have not selected a valid field ")
    ##########################
    print(
        "\nThanks for your participation " + name + ".\nGood luck with the Skills_Assessment!!!\nLet the games begin!!!!\n\n")
    print("<|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|")

    user_profile = [
        {'name: ' + name, 'email: '+ email, 'field: '+ Field, 'level of expertise: ' + Expert_level}
    ]

    def run_test(questions):
        score = 0;
        for question in questions:
            answer = input(question.prompt)
            if answer == question.answer:
                score += 1
        avg = (score / len(questions) * 100)
        print("Hello "+name+" : Your skills assessment is complete!!!\nHey, You Got " + str(score) + " Out Of " + str(
            len(questions)) + " correct.")


        if avg >= 70:
            print("Congratualations you got an average of (" + str(
                avg) + " %)\nyou are truly a " + Expert_level + " ,in " + Field)
        elif avg >= 60:
            print("Congratualations you got an avrage of (" + str(
                avg) + " %)\n" + "you are truly a " + Expert_level + " ,in " + Field)
        elif avg >= 80:
            print("Congratualations >.<*ROCKSTAR*>.< your average is (" + str(
                avg) + " %)\n" + "you are far more than a " + Expert_level + " ,in " + Field + "\nWe are taking to the next level,\nyou'd be introduced to mentor [9INO6ANO]")
        else:
            print(name + ", Unfortunately your score was below average [" + str(
                score) +" / "+str(len(questions))+ "]\nYou may re-take the assessment- if you want?")
            print("Your percentage is " + str(avg) + "%")

        print(user_profile)
        print(name +" has received an overall "+str(avg)+" % for the skills assessment.")

    run_test(questions)

except ValueError as e:
    print(e)
    print("You have entered an Incorrect value!!!\nPlease try again.")
except FileNotFoundError as e:
    print(e)
    print("The file was not found")
except Exception as e:
    print(e)
    print("You typed an invalid value\nPlease read through the instructions carefully.")

print("<|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|><|")
print("This was a demonstration of the type of application we want to develop.\nThank you for your participation (*_-)\n[[][PATH PIONEER][][]\n")
