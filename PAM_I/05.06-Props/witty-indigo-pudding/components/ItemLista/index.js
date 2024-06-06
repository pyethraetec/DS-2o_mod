import React from 'react';
import { View, Text } from 'react-native';
import estilo from './estilo';

export default function ItemLista(props) {
  return (
    <View style={estilo.boxSigno}>
      <Text style={estilo.nomeSigno}>
        {props.signo}
      </Text>

      <Text>
      UF: {props.UF}
      </Text>
      <Text>
      ESTADO: {props.Estado}
      </Text>
      <Text>
      CAPITAL: {props.Capital}
      </Text>
      <Text>
      REGIÃO: {props.Regiao}
      </Text>
    </View>
  )
}