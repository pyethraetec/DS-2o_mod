import React from "react";
import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';

import PontosTuristicos from './components/PontosTuristicos/PontosTuristicos';
import Infos from './components/Infos/Infos';
import TelaInicial from './components/TelaInicial/TelaInicial';

const Stack = createStackNavigator();

export default function App () {
  return (
    
    /*Nome
    Estado
    Região
    Breve descrição histórica(ilustrada com imagens)
    área total territorial
    População total
    IDH
    PIB
    Principais Pontos Turísticos (ilustrado com imagens)
    clima
    */

    <NavigationContainer >
      <Stack.Navigator>
        <Stack.Screen name="Turismo" component = { TelaInicial } />
        <Stack.Screen name="Informações gerais" component = { Infos } />
        <Stack.Screen name="Pontos Turisticos" component = { PontosTuristicos } />
        <Stack.Screen name="Ponto" component = { PontosTuristicos } />
      </Stack.Navigator>
    </NavigationContainer>
  )
}