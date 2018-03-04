import os

script_dir = os.path.dirname(__file__)
fin_path = os.path.join(script_dir, 'data.in')

fin = [line.rstrip('\n') for line in open(fin_path)]
print(fin)