import sqlite3

# Step 1: Connect to the SQLite database (or create a new one if it doesn't exist)
conn = sqlite3.connect('questions.db')

# Step 2: Create a cursor object to interact with the database
cursor = conn.cursor()

# Step 3: Create a table
cursor.execute('''
    CREATE TABLE IF NOT EXISTS q_questions (
        question_id INTEGER PRIMARY KEY,
        question_text TEXT NOT NULL,
        option_a TEXT NOT NULL,
        option_b TEXT NOT NULL,
        option_c TEXT NOT NULL,
        option_d TEXT NOT NULL,
        correct_option TEXT NOT NULL,
        expert_level TEXT NOT NULL
    )
''')

# Step 4: Insert data into the table
cursor.execute('''
    INSERT INTO q_questions (question_text, option_a, option_b, option_c, option_d, correct_option, expert_level)
    VALUES (?, ?, ?, ?, ?, ?, ?)
''', ('What is the purpose of BGP (Border Gateway Protocol) in routing?', 'To manage internal routing within a network',
      'To connect devices within the same local area network', 'To exchange routing and reachability information between autonomous systems', 'To provide security at the network layer', 'C', 'Beginner'))

cursor.execute('''
    INSERT INTO q_questions (question_text, option_a, option_b, option_c, option_d, correct_option, expert_level)
    VALUES (?, ?, ?, ?, ?, ?, ?)
''', ('What does the acronym LAN stand for in networking?', 'Local Area Network', 'Large Area Network',
      'Longitudinal Access Network', 'Limited Access Node', 'A', 'Beginner'))

cursor.execute('''
    INSERT INTO q_questions (question_text, option_a, option_b, option_c, option_d, correct_option, expert_level)
    VALUES (?, ?, ?, ?, ?, ?, ?)
''', ('Which protocol is commonly used for email communication in networking?', 'HTTP', 'FTP', 'SMTP', 'ICMP', 'C', 'Beginner'))

cursor.execute('''
    INSERT INTO q_questions (question_text, option_a, option_b, option_c, option_d, correct_option, expert_level)
    VALUES (?, ?, ?, ?, ?, ?, ?)
''', ('What does the acronym DNS stand for in networking?', 'Dynamic Network Service',
      'Digital Network Security', 'Data Naming System', 'Domain Name System', 'D', 'Beginner'))

cursor.execute('''
    INSERT INTO q_questions (question_text, option_a, option_b, option_c, option_d, correct_option, expert_level)
    VALUES (?, ?, ?, ?, ?, ?, ?)
''', ('What is VLAN (Virtual Local Area Network?', 'A physical network separated into different segments',
      'A logical network created within a physical network', 'A type of network cable', 'A security protocol for wireless networks', 'A', 'Beginner'))

# Step 5: Commit the changes and close the connection
conn.commit()
conn.close()

# Step 6: Query the data
conn = sqlite3.connect('questions.db')
cursor = conn.cursor()

cursor.execute('SELECT * FROM q_questions')
questions = cursor.fetchall()

for question in questions:
    print(question)

# Step 7: Close the connection
conn.close()
