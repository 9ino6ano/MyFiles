#from cryptography.fernet import fernet

master_pwd = input("What is the master password? ")
'''
def write_key():
    key = Fernet.generate_key()
    with open("key.key","wb") as key_file:
        key_file.write(key)'''
'''
def load_key();
    file = open('key.key','rb')
    key = file.read()
    file.close()
    return key
'''

#key = load_key() + master_pwd.bytes / master_pwd.bytes
#fer = Fernet(key)
def view():
    with open('passwords.txt', 'r') as f:
        for line in f.readlines():
            data = (line.rstrip())
            user, passw = data.split("|")
            print("User: [", user, "] -> Password: ", passw)
            #print("User: [", user, "] -> Password: ", fer.decrypt(passw.encode()).decode())
def add():
    user = input('Account Name: ')
    pwd = input('Password: ')

    with open('passwords.txt', 'a') as f:
        f.write(user + "|" + pwd + '\n')
        #f.write(user + "|" + fer.encrypt(pwd.encode()).decode() + '\n')
while True:
    mode = input("Do you want to add a new password or view existing one ?").lower()

    if mode == "q":
        break
    if mode == "view":
        view()
        #print()
    if mode == "add":
        add()
    else:
        print("Invalid Mode Selected")
        #continue