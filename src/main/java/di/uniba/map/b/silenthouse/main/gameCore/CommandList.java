/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.uniba.map.b.silenthouse.main.gameCore;

import di.uniba.map.b.silenthouse.main.base.Command;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class CommandList {
    
      private final List<Command> commands = new ArrayList<>();
    
    /**
     * Costruzione della lista dei comandi di riferimento
     */
    public CommandList(){
        Command nord = new Command("nord");
        nord.setAlias(new String[]{"n", "nord", "north"});
        this.commands.add(nord);
        
        Command sud = new Command("sud");
        sud.setAlias(new String[]{"s", "sud", "south"});
        this.commands.add(sud);
        
        Command est = new Command("est");
        est.setAlias(new String[]{"e", "est", "east"});
        this.commands.add(est);
        
        Command ovest = new Command("ovest");
        ovest.setAlias(new String[]{"o", "ovest", "w", "west" });
        this.commands.add(ovest);
        
        Command end = new Command("fine");
        end.setAlias(new String[]{"end", "fine", "termina", "muori", "ammazzati", "ucciditi", "suicidati", "basta"});
        this.commands.add(end);
        
        
        Command look = new Command("osserva");
        look.setAlias(new String[]{"guarda", "vedi", "trova", "cerca", "descrivi", "guardati"});
        this.commands.add(look);
        
        Command pickup = new Command("raccogli");
        pickup.setAlias(new String[]{"prendi", "ottieni"});
        this.commands.add(pickup);
        
        Command push = new Command("premi");
        push.setAlias(new String[]{"spingi","attiva","tira", "aziona", "abbassa", "alza"});
        this.commands.add(push);
        
        
        Command back = new Command("indietro");
        back.setAlias(new String[]{"torna", "scappa"});
        this.commands.add(back);
        
        Command open = new Command("apri");
        open.setAlias(new String[]{"spalanca"});
        this.commands.add(open);

        Command close = new Command("chiudi");
        open.setAlias(new String[]{"richiudi", "serra"});
        this.commands.add(close);
        
        Command buy = new Command("compra");
        buy.setAlias(new String[]{"acquista"});
        this.commands.add(buy);

        Command talk = new Command("parla");
        talk.setAlias(new String[]{"conversa", "rivolgiti"});
        this.commands.add(talk);

        Command choose = new Command("scegli");
        choose.setAlias(new String[]{"scelgo"});
        this.commands.add(choose);

        Command use = new Command("usa");
        use.setAlias(new String[]{"utilizza"});
        this.commands.add(use);

        Command drink = new Command("bevi");
        this.commands.add(drink);

        Command read = new Command("leggi");
        this.commands.add(read);
    

        Command calvino = new Command("calvino");
        this.commands.add(calvino);
        
        Command inventory = new Command("inventario");
        inventory.setAlias(new String[]{"zaino"});
        this.commands.add(inventory);

        Command insert = new Command("inserisci");
        insert.setAlias(new String[]{"appoggia", "infila", "incastra", "avvicina", "metti"});
        this.commands.add(insert);
        
        Command give = new Command("dai");
        give.setAlias(new String[]{"porgi", "offri", "scambia", "vendi"});
        this.commands.add(give);
    }

    public List<Command> getCommands() {
        return commands;
    }
    
}
