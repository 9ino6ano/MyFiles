#!python3
# mclip.py - A multi-clipboard program

#Step 1 - Program Design and Data Stuctures
TEXT = {'agree': """Yes, I agree. That sounds fine to me.""",
        'busy': """Sorry, can we do this later this week or next week?""",
        'upsell': """Would you consider making this a monthly donation?"""}

#Step 2 - Handle Command Line Arguments
import sys
if len(sys.argv) < 2:
    print('Usage: python mclip.py [keyphrase] - copy phrase text')
    sys.exit()

keyphrase = sys.argv[1] #first CLI arg is the keyphrase

#Step 3: Copy the Right Phrase
if keyphrase in TEXT:
    pyperclip.copy(TEXT[keyphrase])
    print('Text for '+ keyphrase + ' copied to clipboard.')
else:
    print('There is no text for '+ keyphrase)

#Using the instructions in Appendix B for launching command line programs easily, you now have a fast way to copy messages to the clipboard.
#You will have to modify the TEXT dictionary value in the source whenever you want to update the program with a message.
#On windows you can create a batch file to run this program wit WIN-R Run (F.Y.I check Appendix B)
#Enter the following into the file editor and save the file as [mclip.bat] in C:\Windows folder
#   >@py.exe C:\path_to_file\mclip.py %*
#   >pause
