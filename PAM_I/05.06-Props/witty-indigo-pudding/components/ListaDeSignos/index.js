import React from 'react';
import { View, ScrollView } from 'react-native';
import Titulo from '../Titulo';
import ItemLista from '../ItemLista';
import estilo from './estilo.js';

export default function ListaDeSignos() {
  return (
    <View>
      <Titulo />
      <ScrollView style={estilo.lista}>
        <ItemLista signo="São Paulo" UF="SP" Estado="SÃO PAULO" Capital="SÃO PAULO" Regiao= "SUDESTE" />
        <ItemLista signo="Rio de Janeiro" UF="RJ" Estado="RIO DE JANEIRO" Capital="RIO DE JANEIRO" Regiao= "SUDESTE" />
        <ItemLista signo="Bahia" UF="BA" Estado="BAHIA" Capital="SALVADOR" Regiao= "NORDESTE" />
      </ScrollView>
    </View>
  )
}