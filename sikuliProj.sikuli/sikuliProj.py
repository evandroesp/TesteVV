def install_Lamp():
    if os.path.exists("/opt/lampp/"):
        return
    os.system("sudo chmod +x ~/TesteVV/LAMP/xampp-linux*")
    openApp("~/TesteVV/LAMP/xampp-linux-x64-7.1.33-1-installer.run")
    wait("1576516960309.png",15)
    
    click("1576516816439.png")
    sleep(3)
    type(Key.ENTER)
    sleep(3)
    type(Key.ENTER)
    sleep(3)
    type(Key.ENTER)
    sleep(8)
    type(Key.ENTER)
    
    wait("finalizalamp.png")
    sleep(3)
    click("desmarcalamp.png")
    sleep(3)
    click("finalizalamp.png")
    start_Lamp()
    conf_sql()

def start_Lamp():
    openApp("qterminal")
    sleep(3)
    type("sudo /opt/lampp/lampp start" + Key.ENTER)
    sleep(3)
    type("teste" + Key.ENTER)
    sleep(10)

def conf_sql():
    openApp("firefox")
    sleep(5)
    type("localhost/phpmyadmin/" + Key.ENTER)
    sleep(2)
    click("1576520279242.png")
    sleep(2)
    click("1576520300979.png")
    sleep(2)
    type("vv_final" + Key.ENTER)
    sleep(2)
    click("1576520385588.png")
    sleep(2)
    click("1576520411829.png")
    sleep(2)
    click("1576527578441.png")
    sleep(2)
    doubleClick("1576527624149.png")
    sleep(2)
    click("1576520514690.png")
    sleep(2)
    type(Key.ENTER)
    sleep(2)
    type(Key.PAGE_DOWN)
    sleep(2)
    click("1576520625723.png")
    sleep(4)
    closeApp("firefox")

def init_program():
    openApp("qterminal")
    openApp("")
    sleep(2)
    type("java -jar ~/TesteVV/Trabalho2_Evandro/dist/Trabalho2_Evandro.jar" + Key.ENTER)
    sleep(2)
    wait("1576521492099.png",10)
    click("1576521492099.png")
    sleep(2)
    type(Key.DOWN + Key.DOWN + Key.ENTER)

#####        MAIN        #####

install_Lamp()
start_Lamp()
conf_sql()
init_program()

#else:
#    os.system("echo `date` \\t ERRO LAMP>> ~/TesteVV/temp.log");