/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorarquitectura;

import java.util.ArrayList;

/**
 *
 * @author arturoar
 */
public class Memory {
    
    private final int ADRESS_BUS_SIZE;
    private final int memorySize;
    protected Register memory[];

    public Memory(int tamanioBusDirecciones) {
        this.ADRESS_BUS_SIZE = tamanioBusDirecciones;
        this.memorySize = (int) Math.pow(2, tamanioBusDirecciones);
        this.memory = new Register[this.memorySize];
        for (int i = 0; i < this.memorySize; i++){
            this.memory[i] = new Register(16);
        }
    }

    public int getMemorySize() {
        return memorySize;
    }

    public Register[] getMemory() {
        return memory;
    }
    
    
}
