import sqlite3
import json

# Read data from the JSON file
with open('countries.json', 'r') as file:
    countries_data = json.load(file)

# Connect to SQLite database (create if not exists)
dbConnector = sqlite3.connect('countries.db')
cursor = dbConnector.cursor()

# Create a table for countries
cursor.execute('''
    CREATE TABLE countries (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        name TEXT,
        capital TEXT,
        population INTEGER,
        area REAL,
        languages TEXT
    )
''')

# Insert data into the countries table
for country in countries_data:
    cursor.execute('''
        INSERT INTO countries (name, capital, population, area, languages)
        VALUES (?, ?, ?, ?, ?, ?, ?)
    ''', (
        country.get('name', ''),
        country.get('capital', ''),
        country.get('population', 0),
        country.get('area', 0.0),
        ', '.join(language['name'] for language in country.get('languages', []))
    ))

# Commit the changes and close the connection
dbConnector.commit()
dbConnector.close()

print("Data has been successfully inserted into the database.")