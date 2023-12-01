
import xml.etree.ElementTree as ET
mytree = ET.parse('pizza.xml')
myroot = mytree.getroot()
print(myroot)

ingridientsInput = input("insert available ingridients ")
ingridients = ingridientsInput.split(", ")
print (ingridients)