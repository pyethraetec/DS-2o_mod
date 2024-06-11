import React from 'react';
import { Text, View, Image } from 'react-native';
import styles from '../../styles';

import imagem from '../../assets/logo.png';

export default function TelaTrilogia1() {
  return (
    <View style={styles.container}>

      <View style={styles.boxDescricao}>
        <Text style={styles.titulo}>Vestibulinho 2024 - 2º semestre - PRORROGADO - inscrições terminam às 15hs em 17/05/2024</Text>

        <Image source={imagem} style={styles.imagem}/>
        
        <Text style={styles.textos}>
          O prazo de inscrição para o processo seletivo das Escolas Técnicas Estaduais - ETEC vão do período: 04/04/2024 até às 15hs do dia 17/05/2024 .
        </Text>
          
          <Text style={styles.textos}>
          Os interessados em concorrer a uma vaga para estudar nas Etecs no segundo semestre de 2024 devem fazer a inscrição exclusivamente no site do VESTIBULINHO.
    </Text>

      </View>
    </View>
  )
}