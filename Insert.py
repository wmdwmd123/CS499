#Imports necessary to use PyMongo with MongoDB
import json
from bson import json_util
from pymongo import MongoClient

#Sets up client using localhost and port
client = MongoClient('localhost', 27017)

#Sets up database and collection
db = client.market
collection = db.stocks

#Insert function
def insert(document):
  try:
    #Insert one document
    collection.insert_one(document)
    print("Successful")
  #Catch exceptions
  except:
    print("Failed")

#Insert many function
def insertMany(documentList)
  try:
    #Insert list of documents
    collection.insert_many(documentList)
    print("Successful")
  #Catch exception
  except:
    print("Failed")
  
def main():
  #Test document
  document = {"Volume" : 50000, "Beta" : 1.7, "Gap" : 0}
  #Test document list
  documentList = [{"Volume" : 60000, "Beta" : 1.0, "Gap" : 0},
                 {"Volume" : 45000, "Beta" : 1.5, "Gap" : 0},
                 {"Volume" : 55000, "Beta" : 1.7, "Gap" : 0},
                 {"Volume" : 40000, "Beta" : 1.9, "Gap" : 0}]
  
  #Test functions
  insert(document)
  insertMany(documentList)

#Execute main()
main()
  
  


