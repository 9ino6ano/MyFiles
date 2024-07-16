#Project: Adding Bullets to Wiki Markup
#When editing a wikipedia article, you can create a bulleted list by putting each list item on its own line and placing a star in front.

#Step 1: Copy and Paste from the clipboard
#!python3
# bulletPointtAdder.py - Adds Wikipedia bullet points to the start of each line of text on te clipboard.
import pyperclip
text = pyperclip.paster()

#TODO: Seperate lines and add stars

pyperclip.copy(text)

#Step 2: Separate the lines of text and add a star
lines = text.split('\n')
for i in range(len(lines)): #loop through all indexes in te  "lines" list
    lines[i] = '* ' + lines[i] #Add star to each string in "lines" list

#Step 3: Join the modified lines
text = '\n'.join(lines)
pypercli.copy(text)



#When this program is run ,it replaces the text on the clopboard with text that has stars at the start of each line.
