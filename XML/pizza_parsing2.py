import xml.etree.ElementTree as ET 

def parseXML(xmlfile): 
  
    # create element tree object 
    tree = ET.parse(xmlfile) 
  
    # get root element 
    root = tree.getroot() 
  
    ingridientsInput = input("insert available ingridients ")
    ingridients = ingridientsInput.split(", ")
    print (ingridients)

    """
    for i in ingridients:
        if ingridients[i] 
    """
    ingridientsXML =[]
    for x in root[0]:
        print(x.tag, x.attrib)
        #tag = x.toString(encoding='utf8')
        #ingridientsXML.append(tag)
    
    print(ingridientsXML)


parseXML("pizza.xml")