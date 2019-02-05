package io.merklex.dcn.contracts;

import org.web3j.abi.*;
import org.web3j.abi.datatypes.*;
import org.web3j.abi.datatypes.generated.*;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.tx.Contract;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.utils.Numeric;

@javax.annotation.Generated(value="merklex-code-gen")
public class DCN {
    public static final String BINARY = "608060405234801561001057600080fd5b50336000556121de806100246000396000f3fe608060405234801561001057600080fd5b506004361061013b5760003560e060020a90048063a68c68b4116100bc578063c03284ba11610080578063c03284ba14610747578063e455654914610794578063e7172f17146107f3578063f894d39814610898578063fb6b3857146108d0578063fc429e6a1461090e5761013b565b8063a68c68b41461058e578063a88d190214610649578063ace1ed0714610651578063b71a6dd614610675578063be6ae3311461069e5761013b565b8063541694cf11610103578063541694cf146102e95780637c734736146103ad578063831b55d61461046a57806383daf06d146104ae5780638e98cee1146105535761013b565b80630faf09041461014057806311a86b151461016857806314f604b81461022157806337f265e61461025f578063431ec601146102c8575b600080fd5b6101666004803603602081101561015657600080fd5b5035600160a060020a031661094c565b005b6101666004803603606081101561017e57600080fd5b81019060208101813564010000000081111561019957600080fd5b8201836020820111156101ab57600080fd5b803590602001918460018302840111640100000000831117156101cd57600080fd5b91908080601f01602080910402602001604051908101604052818152929190602084018383808284376000920191909152509295505050813563ffffffff1692505060200135600160a060020a0316610961565b6101666004803603606081101561023757600080fd5b50803563ffffffff908116916020810135909116906040013567ffffffffffffffff166109f4565b6102916004803603604081101561027557600080fd5b508035600160a060020a0316906020013563ffffffff16610bad565b60405167ffffffffffffffff9485168152928416602084015290831660408084019190915292166060820152608001905180910390f35b6102d0610c63565b60405163ffffffff909116815260200160405180910390f35b61030c600480360360208110156102ff57600080fd5b503563ffffffff16610c78565b60405167ffffffffffffffff8085166020830152600160a060020a03841660408301528216606082015260808082528190810186818151815260200191508051906020019080838360005b8381101561036f578082015183820152602001610357565b50505050905090810190601f16801561039c5780820380516001836020036101000a031916815260200191505b509550505050505060405180910390f35b610166600480360360608110156103c357600080fd5b8101906020810181356401000000008111156103de57600080fd5b8201836020820111156103f057600080fd5b8035906020019184600183028401116401000000008311171561041257600080fd5b91908080601f01602080910402602001604051908101604052818152929190602084018383808284376000920191909152509295505050813567ffffffffffffffff1692505060200135600160a060020a0316610cd4565b61049c6004803603604081101561048057600080fd5b508035600160a060020a0316906020013563ffffffff16610d73565b60405190815260200160405180910390f35b610166600480360360208110156104c457600080fd5b8101906020810181356401000000008111156104df57600080fd5b8201836020820111156104f157600080fd5b8035906020019184600183028401116401000000008311171561051357600080fd5b91908080601f0160208091040260200160405190810160405281815292919060208401838380828437600092019190915250929550610d98945050505050565b6101666004803603606081101561056957600080fd5b5063ffffffff8135169067ffffffffffffffff602082013581169160400135166112d1565b6105b1600480360360208110156105a457600080fd5b503563ffffffff1661140d565b60405167ffffffffffffffff83166020820152600160a060020a038216604082015260608082528190810185818151815260200191508051906020019080838360005b8381101561060c5780820151838201526020016105f4565b50505050905090810190601f1680156106395780820380516001836020036101000a031916815260200191505b5094505050505060405180910390f35b6102d061145e565b610659611473565b604051600160a060020a03909116815260200160405180910390f35b6101666004803603604081101561068b57600080fd5b5063ffffffff8135169060200135611479565b6106d8600480360360608110156106b457600080fd5b50600160a060020a038135169063ffffffff60208201358116916040013516611550565b6040516007998a0b8a0b815297890b890b602089015295880b880b60408089019190915294880b880b606088015267ffffffffffffffff938416608088015291870b870b60a0870152860b90950b60c085015293841660e0840152921661010082015261012001905180910390f35b6101666004803603608081101561075d57600080fd5b50803563ffffffff908116916020810135909116906040810135600160a060020a0316906060013567ffffffffffffffff16611662565b6107ce600480360360608110156107aa57600080fd5b50600160a060020a038135169063ffffffff60208201358116916040013516611731565b60405167ffffffffffffffff9283168152911660208201526040908101905180910390f35b6101666004803603602081101561080957600080fd5b81019060208101813564010000000081111561082457600080fd5b82018360208201111561083657600080fd5b8035906020019184600183028401116401000000008311171561085857600080fd5b91908080601f0160208091040260200160405190810160405281815292919060208401838380828437600092019190915250929550611793945050505050565b610166600480360360608110156108ae57600080fd5b5063ffffffff81351690600160a060020a036020820135169060400135611d6a565b610166600480360360608110156108e657600080fd5b50803563ffffffff908116916020810135909116906040013567ffffffffffffffff16611e3b565b6101666004803603606081101561092457600080fd5b50803563ffffffff908116916020810135909116906040013567ffffffffffffffff16611f7b565b60005433811461095b57600080fd5b50600055565b6109696120cc565b60005433811461097f57600182526001601f8301fd5b84516008811461099557600283526001601f8401fd5b6002548086106109ab57600384526001601f8501fd5b60015464010000000081106109c657600485526001601f8601fd5b8060020260030160208901518760a060020a8a02178117808355600184016001555050505050505050505050565b6109fc6120cc565b610a046120e8565b610a0c6120cc565b610a14612104565b600254808710610a2a57600185526001601f8601fd5b50841515610a3e57600284526001601f8501fd5b85640200000003015467ffffffffffffffff60a060020a8204168602600160a060020a0382167f23b872dd0000000000000000000000000000000000000000000000000000000086523360048701523060248701528160448701526020856064886000855af1801515610ab757600388526001601f8901fd5b8551801515610acc57600489526001601f8a01fd5b5050896403000000000233680300000000000000000264030000000360c060020a010101896003028101805467ffffffffffffffff8b67ffffffffffffffff6801000000000000000084041601168b67ffffffffffffffff83160167ffffffffffffffff811115610b435760058c526001601f8d01fd5b80680100000000000000008302176fffffffffffffffffffffffffffffffff1984161784553389528e60208a01528d60408a01527f80e69f6146713abffddddec8ef3901e1cd3fd9e079375d62e04e2719f1adf50060608aa1505050505050505050505050505050565b600080600080610bbb6120e8565b8560020260030163ffffffff60a060020a82540416876403000000000289680300000000000000000264030000000360c060020a0101018160030281018054600182015467ffffffffffffffff60c060020a820416875277ffffffffffffffffffffffffffffffffffffffffffffffff8116602088015267ffffffffffffffff60c060020a830416604088015267ffffffffffffffff608060020a8304166060880152608087f35b6000610c6d6120cc565b600154808252602082f35b60606000806000610c87612120565b85600202600301805460808352600860808401528060a084015263ffffffff60a060020a8204166020840152600160a060020a03811660408401526001820154905080606084015260a883f35b610cdc6120cc565b600054338114610cf257600182526001601f8301fd5b6002546401000000008110610d0d57600283526001601f8401fd5b855160048114610d2357600384526001601f8501fd5b851515610d3657600484526001601f8501fd5b841515610d4957600584526001601f8501fd5b602087015160a060020a969096029094179490941764020000000385015550505060010160025550565b6000610d7d6120cc565b83640100000000026403000000030183810180548352602083f35b610da06120cc565b610da861213c565b6000806000855160208701915080820192506095810615610dcf57600186526001601f8701fd5b505b81811415610ddb57005b8051601482019150600160a060020a036c0100000000000000000000000082041693507fe0bfc2789e007df269c9fec46d3ddd4acf88fdf0f76af154da933aab7fb2f2b985528151905060208201915060008063ffffffff60e060020a84041680602089015263ffffffff60c060020a8504168060408a015267ffffffffffffffff608060020a86041692508260608a0152816403000000000288680300000000000000000264030000000360c060020a01010181600302810194508260020260030154600160a060020a0381168033141515610ebe5760028d526001601f8e01fd5b63ffffffff60a060020a83041684811415610edf5760068e526001601f8f01fd5b5050506002850154608060020a900467ffffffffffffffff16808511610f0b5760038c526001601f8d01fd5b5050505067ffffffffffffffff6801000000000000000084041680608089015267ffffffffffffffff84168060a08a015280680100000000000000008302608060020a85021717600285015550505082519150602083019250600067ffffffffffffffff60c060020a84041660c060020a81029150678000000000000000811615610f9c5767ffffffffffffffff19175b8060c08901525067ffffffffffffffff608060020a840416608060020a810282179150678000000000000000811615610fdb5767ffffffffffffffff19175b8060e08901525067ffffffffffffffff68010000000000000000840416680100000000000000008102821791506780000000000000008116156110245767ffffffffffffffff19175b8061010089015267ffffffffffffffff841680831792506780000000000000008116156110575767ffffffffffffffff19175b806101208a0152826001850155600184015467ffffffffffffffff6801000000000000000082041667800000000000000081161561109b5767ffffffffffffffff19175b9092039167ffffffffffffffff81166780000000000000008216156110c65767ffffffffffffffff19175b80830392505050835467ffffffffffffffff60c060020a820416830167ffffffffffffffff608060020a8304168301677fffffffffffffff8113677fffffffffffffff19821217677fffffffffffffff8313677fffffffffffffff1984121717156111375760048d526001601f8e01fd5b608060020a67ffffffffffffffff82160260c060020a67ffffffffffffffff841602176fffffffffffffffffffffffffffffffff84161787556101408c207f19010000000000000000000000000000000000000000000000000000000000008d527fe3d3073cc59e3a3126c17585a7e516a048e61a9a1c82144af982d1c194b1871060028e015260228d0181905260428d209050808d528951985060208a0199508860208e01528951985060208a0199508860408e015289517f0100000000000000000000000000000000000000000000000000000000000000900460ff1660608e0152505050600196870196600096509450899350859250611238915050565b602002015160608701516020880151604089015160405160008152602001604052604051808581526020018460ff1660ff1681526020018381526020018281526020019450505050506020604051602081039080840390855afa1580156112a3573d6000803e3d6000fd5b50505060206040510351600160a060020a031690508381146112cb57600586526001601f8701fd5b50610dd1565b6112d96120cc565b6112e1612104565b62278d004201841161a8c042018510171561130257600182526001601f8301fd5b60015480861061131857600283526001601f8401fd5b508460020260030163ffffffff60a060020a82540416866403000000000233680300000000000000000264030000000360c060020a010101816003028101805467ffffffffffffffff60c060020a8204168089101561137d57600388526001601f8901fd5b808911156113ab5760c060020a890277ffffffffffffffffffffffffffffffffffffffffffffffff83161783555b67ffffffffffffffff60c060020a600185015404168a60c060020a60018301021760018501553388528b60208901527f1fceb0227bbc8d151c84f6f90cac5b115842ef0ed5dd5b6ee6bf6eca2dae91f7604089a1505050505050505050505050565b606060008061141a61215a565b846402000000030154606082526004606083015280608083015267ffffffffffffffff60a060020a8204166020830152600160a060020a0381166040830152608482f35b60006114686120cc565b600254808252602082f35b60005490565b6114816120cc565b6114896120e8565b6114916120cc565b83151561149a57005b6002548086106114b057600184526001601f8501fd5b507f23b872dd000000000000000000000000000000000000000000000000000000008252336004830152306024830152836044830152846402000000030154600160a060020a0381166020836064866000855af180151561151757600286526001601f8701fd5b835180151561152c57600387526001601f8801fd5b50505050505064010000000033029290920164030000000301805491909101905550565b6000806000806000806000806000611566612176565b8b640300000000028d680300000000000000000264030000000360c060020a0101018b600302810180546001820154600283015467ffffffffffffffff60c060020a840416865267ffffffffffffffff608060020a840416602087015267ffffffffffffffff68010000000000000000830416604087015267ffffffffffffffff8216606087015267ffffffffffffffff608060020a820416608087015267ffffffffffffffff60c060020a83041660a087015267ffffffffffffffff608060020a83041660c087015267ffffffffffffffff6801000000000000000082041660e087015267ffffffffffffffff811661010087015261012086f35b61166a6120cc565b81151561167357005b600360028602015433600160a060020a0382161461169757600182526001601f8301fd5b856403000000000284680300000000000000000264030000000360c060020a010101856003028101805467ffffffffffffffff8116808711156116e057600286526001601f8701fd5b67ffffffffffffffff19919091169086900317905550505064020000000383015464010000000090920290920164030000000301805460a060020a90920467ffffffffffffffff1690920201905550565b60008061173c612194565b846403000000000286680300000000000000000264030000000360c060020a010101846003028101805467ffffffffffffffff68010000000000000000820416845267ffffffffffffffff81166020850152604084f35b61179b612120565b60208201825180820160a059035260048110156117c457600060205903526001601f6020590301fd5b815160048301925063ffffffff60e060020a82041660015480821015156117f757600160205903526001601f6020590301fd5b60036002830201805433600160a060020a0382161461182257600260205903526001601f6020590301fd5b63ffffffff60a060020a82041660c059035260018201546080590352836060590352505050505b60058360a05903510310611d52578251905060058301925060ff7b01000000000000000000000000000000000000000000000000000000820416602c810280850160a05903518111156118a857600360205903526001601f6020590301fd5b80604059035250505063ffffffff60e060020a8204166000805b6040590351861015611d305785519350601486019550606059035164030000000002600160a060020a036c01000000000000000000000000860416680300000000000000000264030000000360c060020a0101018651945060188701965067ffffffffffffffff60c060020a86041667ffffffffffffffff608060020a87041667ffffffffffffffff680100000000000000008804166780000000000000008316156119775767ffffffffffffffff19831792505b6780000000000000008216156119965767ffffffffffffffff19821791505b948201949381019360c05903516003028401876003028501600182015477ffffffffffffffffffffffffffffffffffffffffffffffff8116804211156119e857600460205903526001601f6020590301fd5b5050815467ffffffffffffffff808216870185900390811115611a1757600560205903526001601f6020590301fd5b608060020a820467ffffffffffffffff1685016080590386815101815267ffffffffffffffff60c060020a85041680831115611a5f57600660205903526001601f6020590301fd5b83608060020a84021777ffffffffffffffff0000000000000000ffffffffffffffff19861617875550505050506000808a6003028801805467ffffffffffffffff8116888101905067ffffffffffffffff811115611ac957600760205903526001601f6020590301fd5b67ffffffffffffffff60c060020a830416945067ffffffffffffffff608060020a8304169350678000000000000000851615611b0e5767ffffffffffffffff19851794505b678000000000000000841615611b2d5767ffffffffffffffff19841793505b89850194508884019350677fffffffffffffff8413677fffffffffffffff19851217677fffffffffffffff8613677fffffffffffffff198712171715611b7f57600860205903526001601f6020590301fd5b80608060020a850260c060020a870217176fffffffffffffffff00000000000000008316178355505050600183015467ffffffffffffffff60c060020a82041667ffffffffffffffff608060020a830416678000000000000000821615611bef5767ffffffffffffffff19821791505b678000000000000000811615611c0b5767ffffffffffffffff19175b8084128286121715611c2957600960205903526001601f6020590301fd5b50505060028301546002600183120260018412018060038114611c5b5760018114611c7b5760028114611cd557611d20565b8385171515611c7657600a60205903526001601f6020590301fd5b611d20565b831515611c9457600b60205903526001601f6020590301fd5b836305f5e10086600003020467ffffffffffffffff68010000000000000000850416811115611ccf57600c60205903526001601f6020590301fd5b50611d20565b841515611cee57600d60205903526001601f6020590301fd5b836000036305f5e10086020467ffffffffffffffff8416811015611d1e57600e60205903526001601f6020590301fd5b505b50505050505050505050506118c2565b80821715611d4a57600f60205903526001601f6020590301fd5b505050611849565b60805903516060590351600202600401555050505050565b611d726120cc565b611d7a612104565b611d826120cc565b831515611d8b57005b336401000000000264030000000301868101805486811015611db357600186526001601f8701fd5b7fa9059cbb000000000000000000000000000000000000000000000000000000008552876004860152866024860152886402000000030154600160a060020a0381166020866044896000855af1801515611e1357600289526001601f8a01fd5b8651801515611e285760038a526001601f8b01fd5b5050505095909503909455505050505050565b611e436120cc565b611e4b6120e8565b336401000000000264030000000301848101805486640200000003015467ffffffffffffffff60a060020a82041680880283811115611e9057600188526001601f8901fd5b8084039350838555505050505050846403000000000233680300000000000000000264030000000360c060020a01010184600302810180548567ffffffffffffffff68010000000000000000830416018667ffffffffffffffff83160167ffffffffffffffff8216915067ffffffffffffffff811115611f1657600287526001601f8801fd5b80680100000000000000008302176fffffffffffffffffffffffffffffffff1984161784553386528960208701528860408701527f80e69f6146713abffddddec8ef3901e1cd3fd9e079375d62e04e2719f1adf500606087a150505050505050505050565b611f836120cc565b611f8b6120e8565b846002026003015463ffffffff60a060020a820416866403000000000233680300000000000000000264030000000360c060020a01010181600302810177ffffffffffffffffffffffffffffffffffffffffffffffff60018201541680421015611ffb57600187526001601f8801fd5b5050866003028101805467ffffffffffffffff81168089111561202457600288526001601f8901fd5b88810390508067ffffffffffffffff198316178355505050336401000000000264030000000301878101805489640200000003015467ffffffffffffffff60a060020a820416808b028084019350808410156120865760038b526001601f8c01fd5b50505090555033845260208401889052604084018790527f80e69f6146713abffddddec8ef3901e1cd3fd9e079375d62e04e2719f1adf500606085a15050505050505050565b6020604051908101604052600181602080388339509192915050565b6080604051908101604052600481608080388339509192915050565b6060604051908101604052600381606080388339509192915050565b60c060405190810160405260068160c080388339509192915050565b610140604051908101604052600a8161014080388339509192915050565b60a060405190810160405260058160a080388339509192915050565b61010060405190810160405260088161010080388339509192915050565b6040805190810160405280600290602082028038833950919291505056fea165627a7a723058205283d6bd6260ae2049352bb5fcc2c56bf20774edeace3f20b1ef5196f87b80360029";
    public static Function set_creator(String new_creator) {
        return new Function(
            "set_creator",
            Collections.singletonList(
                new org.web3j.abi.datatypes.Address(new_creator)
            ),
            Collections.emptyList()
        );
    }
    public static Function add_exchange(String name, int quote_asset_id, String addr) {
        return new Function(
            "add_exchange",
            Arrays.asList(
                new org.web3j.abi.datatypes.Utf8String(name)
                , new org.web3j.abi.datatypes.generated.Uint32(quote_asset_id)
                , new org.web3j.abi.datatypes.Address(addr)
            ),
            Collections.emptyList()
        );
    }
    public static Function deposit_asset_to_session(int exchange_id, int asset_id, long quantity) {
        return new Function(
            "deposit_asset_to_session",
            Arrays.asList(
                new org.web3j.abi.datatypes.generated.Uint32(exchange_id)
                , new org.web3j.abi.datatypes.generated.Uint32(asset_id)
                , new org.web3j.abi.datatypes.generated.Uint64(quantity)
            ),
            Collections.emptyList()
        );
    }
    public static Function get_session(String user, int exchange_id) {
        return new Function(
            "get_session",
            Arrays.asList(
                new org.web3j.abi.datatypes.Address(user)
                , new org.web3j.abi.datatypes.generated.Uint32(exchange_id)
            ),
            Arrays.asList(
                new TypeReference<org.web3j.abi.datatypes.generated.Uint64>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Uint64>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Uint64>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Uint64>() {}
            )
        );
    }
    public static GetSessionReturnValue query_get_session(String contractAddress, Web3j web3j, Function function) throws IOException {
        String encodedFunction = FunctionEncoder.encode(function);
        org.web3j.protocol.core.methods.response.EthCall ethCall = web3j.ethCall(
            Transaction.createEthCallTransaction("0x0000000000000000000000000000000000000000", contractAddress, encodedFunction),
            DefaultBlockParameterName.LATEST
        ).send();
        String value = ethCall.getValue();
        List<Type> values = FunctionReturnDecoder.decode(value, function.getOutputParameters());
        GetSessionReturnValue returnValue = new GetSessionReturnValue();
        returnValue.version = ((BigInteger) values.get(0).getValue()).longValue();
        returnValue.unlock_at = ((BigInteger) values.get(1).getValue()).longValue();
        returnValue.fee_limit = ((BigInteger) values.get(2).getValue()).longValue();
        returnValue.fee_used = ((BigInteger) values.get(3).getValue()).longValue();
        return returnValue;
    }
    public static Function get_exchange_count() {
        return new Function(
            "get_exchange_count",
            Collections.emptyList(),
            Collections.singletonList(
                new TypeReference<org.web3j.abi.datatypes.generated.Uint32>() {}
            )
        );
    }
    public static GetExchangeCountReturnValue query_get_exchange_count(String contractAddress, Web3j web3j, Function function) throws IOException {
        String encodedFunction = FunctionEncoder.encode(function);
        org.web3j.protocol.core.methods.response.EthCall ethCall = web3j.ethCall(
            Transaction.createEthCallTransaction("0x0000000000000000000000000000000000000000", contractAddress, encodedFunction),
            DefaultBlockParameterName.LATEST
        ).send();
        String value = ethCall.getValue();
        List<Type> values = FunctionReturnDecoder.decode(value, function.getOutputParameters());
        GetExchangeCountReturnValue returnValue = new GetExchangeCountReturnValue();
        returnValue.count = ((BigInteger) values.get(0).getValue()).intValue();
        return returnValue;
    }
    public static Function get_exchange(int exchange_id) {
        return new Function(
            "get_exchange",
            Collections.singletonList(
                new org.web3j.abi.datatypes.generated.Uint32(exchange_id)
            ),
            Arrays.asList(
                new TypeReference<org.web3j.abi.datatypes.Utf8String>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Uint64>() {}
                , new TypeReference<org.web3j.abi.datatypes.Address>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Uint64>() {}
            )
        );
    }
    public static GetExchangeReturnValue query_get_exchange(String contractAddress, Web3j web3j, Function function) throws IOException {
        String encodedFunction = FunctionEncoder.encode(function);
        org.web3j.protocol.core.methods.response.EthCall ethCall = web3j.ethCall(
            Transaction.createEthCallTransaction("0x0000000000000000000000000000000000000000", contractAddress, encodedFunction),
            DefaultBlockParameterName.LATEST
        ).send();
        String value = ethCall.getValue();
        List<Type> values = FunctionReturnDecoder.decode(value, function.getOutputParameters());
        GetExchangeReturnValue returnValue = new GetExchangeReturnValue();
        returnValue.name = (String) values.get(0).getValue();
        returnValue.quote_asset_id = ((BigInteger) values.get(1).getValue()).longValue();
        returnValue.addr = (String) values.get(2).getValue();
        returnValue.fee_balance = ((BigInteger) values.get(3).getValue()).longValue();
        return returnValue;
    }
    public static Function add_asset(String symbol, long unit_scale, String contract_address) {
        return new Function(
            "add_asset",
            Arrays.asList(
                new org.web3j.abi.datatypes.Utf8String(symbol)
                , new org.web3j.abi.datatypes.generated.Uint64(unit_scale)
                , new org.web3j.abi.datatypes.Address(contract_address)
            ),
            Collections.emptyList()
        );
    }
    public static Function get_balance(String user, int asset_id) {
        return new Function(
            "get_balance",
            Arrays.asList(
                new org.web3j.abi.datatypes.Address(user)
                , new org.web3j.abi.datatypes.generated.Uint32(asset_id)
            ),
            Collections.singletonList(
                new TypeReference<org.web3j.abi.datatypes.generated.Uint256>() {}
            )
        );
    }
    public static GetBalanceReturnValue query_get_balance(String contractAddress, Web3j web3j, Function function) throws IOException {
        String encodedFunction = FunctionEncoder.encode(function);
        org.web3j.protocol.core.methods.response.EthCall ethCall = web3j.ethCall(
            Transaction.createEthCallTransaction("0x0000000000000000000000000000000000000000", contractAddress, encodedFunction),
            DefaultBlockParameterName.LATEST
        ).send();
        String value = ethCall.getValue();
        List<Type> values = FunctionReturnDecoder.decode(value, function.getOutputParameters());
        GetBalanceReturnValue returnValue = new GetBalanceReturnValue();
        returnValue.return_balance = (BigInteger) values.get(0).getValue();
        return returnValue;
    }
    public static Function set_limit(String data) {
        return new Function(
            "set_limit",
            Collections.singletonList(
                new org.web3j.abi.datatypes.DynamicBytes(Numeric.hexStringToByteArray(data))
            ),
            Collections.emptyList()
        );
    }
    public static Function update_session(int exchange_id, long unlock_at, long fee_limit) {
        return new Function(
            "update_session",
            Arrays.asList(
                new org.web3j.abi.datatypes.generated.Uint32(exchange_id)
                , new org.web3j.abi.datatypes.generated.Uint64(unlock_at)
                , new org.web3j.abi.datatypes.generated.Uint64(fee_limit)
            ),
            Collections.emptyList()
        );
    }
    public static Function get_asset(int asset_id) {
        return new Function(
            "get_asset",
            Collections.singletonList(
                new org.web3j.abi.datatypes.generated.Uint32(asset_id)
            ),
            Arrays.asList(
                new TypeReference<org.web3j.abi.datatypes.Utf8String>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Uint64>() {}
                , new TypeReference<org.web3j.abi.datatypes.Address>() {}
            )
        );
    }
    public static GetAssetReturnValue query_get_asset(String contractAddress, Web3j web3j, Function function) throws IOException {
        String encodedFunction = FunctionEncoder.encode(function);
        org.web3j.protocol.core.methods.response.EthCall ethCall = web3j.ethCall(
            Transaction.createEthCallTransaction("0x0000000000000000000000000000000000000000", contractAddress, encodedFunction),
            DefaultBlockParameterName.LATEST
        ).send();
        String value = ethCall.getValue();
        List<Type> values = FunctionReturnDecoder.decode(value, function.getOutputParameters());
        GetAssetReturnValue returnValue = new GetAssetReturnValue();
        returnValue.symbol = (String) values.get(0).getValue();
        returnValue.unit_scale = ((BigInteger) values.get(1).getValue()).longValue();
        returnValue.contract_address = (String) values.get(2).getValue();
        return returnValue;
    }
    public static Function get_asset_count() {
        return new Function(
            "get_asset_count",
            Collections.emptyList(),
            Collections.singletonList(
                new TypeReference<org.web3j.abi.datatypes.generated.Uint32>() {}
            )
        );
    }
    public static GetAssetCountReturnValue query_get_asset_count(String contractAddress, Web3j web3j, Function function) throws IOException {
        String encodedFunction = FunctionEncoder.encode(function);
        org.web3j.protocol.core.methods.response.EthCall ethCall = web3j.ethCall(
            Transaction.createEthCallTransaction("0x0000000000000000000000000000000000000000", contractAddress, encodedFunction),
            DefaultBlockParameterName.LATEST
        ).send();
        String value = ethCall.getValue();
        List<Type> values = FunctionReturnDecoder.decode(value, function.getOutputParameters());
        GetAssetCountReturnValue returnValue = new GetAssetCountReturnValue();
        returnValue.count = ((BigInteger) values.get(0).getValue()).intValue();
        return returnValue;
    }
    public static Function get_creator() {
        return new Function(
            "get_creator",
            Collections.emptyList(),
            Collections.singletonList(
                new TypeReference<org.web3j.abi.datatypes.Address>() {}
            )
        );
    }
    public static GetCreatorReturnValue query_get_creator(String contractAddress, Web3j web3j, Function function) throws IOException {
        String encodedFunction = FunctionEncoder.encode(function);
        org.web3j.protocol.core.methods.response.EthCall ethCall = web3j.ethCall(
            Transaction.createEthCallTransaction("0x0000000000000000000000000000000000000000", contractAddress, encodedFunction),
            DefaultBlockParameterName.LATEST
        ).send();
        String value = ethCall.getValue();
        List<Type> values = FunctionReturnDecoder.decode(value, function.getOutputParameters());
        GetCreatorReturnValue returnValue = new GetCreatorReturnValue();
        returnValue.dcn_creator = (String) values.get(0).getValue();
        return returnValue;
    }
    public static Function deposit_asset(int asset_id, BigInteger amount) {
        return new Function(
            "deposit_asset",
            Arrays.asList(
                new org.web3j.abi.datatypes.generated.Uint32(asset_id)
                , new org.web3j.abi.datatypes.generated.Uint256(amount)
            ),
            Collections.emptyList()
        );
    }
    public static Function get_session_state(String user, int exchange_id, int asset_id) {
        return new Function(
            "get_session_state",
            Arrays.asList(
                new org.web3j.abi.datatypes.Address(user)
                , new org.web3j.abi.datatypes.generated.Uint32(exchange_id)
                , new org.web3j.abi.datatypes.generated.Uint32(asset_id)
            ),
            Arrays.asList(
                new TypeReference<org.web3j.abi.datatypes.generated.Int64>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Int64>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Int64>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Int64>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Uint64>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Int64>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Int64>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Uint64>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Uint64>() {}
            )
        );
    }
    public static GetSessionStateReturnValue query_get_session_state(String contractAddress, Web3j web3j, Function function) throws IOException {
        String encodedFunction = FunctionEncoder.encode(function);
        org.web3j.protocol.core.methods.response.EthCall ethCall = web3j.ethCall(
            Transaction.createEthCallTransaction("0x0000000000000000000000000000000000000000", contractAddress, encodedFunction),
            DefaultBlockParameterName.LATEST
        ).send();
        String value = ethCall.getValue();
        List<Type> values = FunctionReturnDecoder.decode(value, function.getOutputParameters());
        GetSessionStateReturnValue returnValue = new GetSessionStateReturnValue();
        returnValue.quote_qty = ((BigInteger) values.get(0).getValue()).longValue();
        returnValue.base_qty = ((BigInteger) values.get(1).getValue()).longValue();
        returnValue.quote_shift = ((BigInteger) values.get(2).getValue()).longValue();
        returnValue.base_shift = ((BigInteger) values.get(3).getValue()).longValue();
        returnValue.version = ((BigInteger) values.get(4).getValue()).longValue();
        returnValue.min_quote = ((BigInteger) values.get(5).getValue()).longValue();
        returnValue.min_base = ((BigInteger) values.get(6).getValue()).longValue();
        returnValue.long_max_price = ((BigInteger) values.get(7).getValue()).longValue();
        returnValue.short_min_price = ((BigInteger) values.get(8).getValue()).longValue();
        return returnValue;
    }
    public static Function withdraw_from_session(int exchange_id, int asset_id, String user, long amount) {
        return new Function(
            "withdraw_from_session",
            Arrays.asList(
                new org.web3j.abi.datatypes.generated.Uint32(exchange_id)
                , new org.web3j.abi.datatypes.generated.Uint32(asset_id)
                , new org.web3j.abi.datatypes.Address(user)
                , new org.web3j.abi.datatypes.generated.Uint64(amount)
            ),
            Collections.emptyList()
        );
    }
    public static Function get_session_balance(String user, int exchange_id, int asset_id) {
        return new Function(
            "get_session_balance",
            Arrays.asList(
                new org.web3j.abi.datatypes.Address(user)
                , new org.web3j.abi.datatypes.generated.Uint32(exchange_id)
                , new org.web3j.abi.datatypes.generated.Uint32(asset_id)
            ),
            Arrays.asList(
                new TypeReference<org.web3j.abi.datatypes.generated.Uint64>() {}
                , new TypeReference<org.web3j.abi.datatypes.generated.Uint64>() {}
            )
        );
    }
    public static GetSessionBalanceReturnValue query_get_session_balance(String contractAddress, Web3j web3j, Function function) throws IOException {
        String encodedFunction = FunctionEncoder.encode(function);
        org.web3j.protocol.core.methods.response.EthCall ethCall = web3j.ethCall(
            Transaction.createEthCallTransaction("0x0000000000000000000000000000000000000000", contractAddress, encodedFunction),
            DefaultBlockParameterName.LATEST
        ).send();
        String value = ethCall.getValue();
        List<Type> values = FunctionReturnDecoder.decode(value, function.getOutputParameters());
        GetSessionBalanceReturnValue returnValue = new GetSessionBalanceReturnValue();
        returnValue.total_deposit = ((BigInteger) values.get(0).getValue()).longValue();
        returnValue.asset_balance = ((BigInteger) values.get(1).getValue()).longValue();
        return returnValue;
    }
    public static Function apply_settlement_groups(String data) {
        return new Function(
            "apply_settlement_groups",
            Collections.singletonList(
                new org.web3j.abi.datatypes.DynamicBytes(Numeric.hexStringToByteArray(data))
            ),
            Collections.emptyList()
        );
    }
    public static Function withdraw_asset(int asset_id, String destination, BigInteger amount) {
        return new Function(
            "withdraw_asset",
            Arrays.asList(
                new org.web3j.abi.datatypes.generated.Uint32(asset_id)
                , new org.web3j.abi.datatypes.Address(destination)
                , new org.web3j.abi.datatypes.generated.Uint256(amount)
            ),
            Collections.emptyList()
        );
    }
    public static Function transfer_to_session(int exchange_id, int asset_id, long quantity) {
        return new Function(
            "transfer_to_session",
            Arrays.asList(
                new org.web3j.abi.datatypes.generated.Uint32(exchange_id)
                , new org.web3j.abi.datatypes.generated.Uint32(asset_id)
                , new org.web3j.abi.datatypes.generated.Uint64(quantity)
            ),
            Collections.emptyList()
        );
    }
    public static Function transfer_from_session(int exchange_id, int asset_id, long quantity) {
        return new Function(
            "transfer_from_session",
            Arrays.asList(
                new org.web3j.abi.datatypes.generated.Uint32(exchange_id)
                , new org.web3j.abi.datatypes.generated.Uint32(asset_id)
                , new org.web3j.abi.datatypes.generated.Uint64(quantity)
            ),
            Collections.emptyList()
        );
    }
    public static String DeployData() {
        String encodedConstructor = FunctionEncoder.encodeConstructor(
            Collections.emptyList()
        );
        return BINARY + encodedConstructor;
    }
    public static class SessionUpdated {
        public String user;
        public long exchange_id;
    }
    public static final Event SessionUpdated_EVENT = new Event("SessionUpdated",
        Arrays.asList(
            new TypeReference<org.web3j.abi.datatypes.Address>() {}
            , new TypeReference<org.web3j.abi.datatypes.generated.Uint64>() {}
        )
    );
    public static final String SessionUpdated_EVENT_HASH = EventEncoder.encode(SessionUpdated_EVENT);
    public static SessionUpdated ExtractSessionUpdated(Log log) {
        List<String> topics = log.getTopics();
        if (topics.size() == 0 || !SessionUpdated_EVENT_HASH.equals(topics.get(0))) {
            return null;
        }
        EventValues values = Contract.staticExtractEventParameters(SessionUpdated_EVENT, log);
        SessionUpdated event = new SessionUpdated();
        event.user = (String) values.getNonIndexedValues().get(0).getValue();
        event.exchange_id = ((BigInteger) values.getNonIndexedValues().get(1).getValue()).longValue();
        return event;
    }
    public static class PositionUpdated {
        public String user;
        public long exchange_id;
        public int asset_id;
    }
    public static final Event PositionUpdated_EVENT = new Event("PositionUpdated",
        Arrays.asList(
            new TypeReference<org.web3j.abi.datatypes.Address>() {}
            , new TypeReference<org.web3j.abi.datatypes.generated.Uint64>() {}
            , new TypeReference<org.web3j.abi.datatypes.generated.Uint32>() {}
        )
    );
    public static final String PositionUpdated_EVENT_HASH = EventEncoder.encode(PositionUpdated_EVENT);
    public static PositionUpdated ExtractPositionUpdated(Log log) {
        List<String> topics = log.getTopics();
        if (topics.size() == 0 || !PositionUpdated_EVENT_HASH.equals(topics.get(0))) {
            return null;
        }
        EventValues values = Contract.staticExtractEventParameters(PositionUpdated_EVENT, log);
        PositionUpdated event = new PositionUpdated();
        event.user = (String) values.getNonIndexedValues().get(0).getValue();
        event.exchange_id = ((BigInteger) values.getNonIndexedValues().get(1).getValue()).longValue();
        event.asset_id = ((BigInteger) values.getNonIndexedValues().get(2).getValue()).intValue();
        return event;
    }
    public static class GetSessionReturnValue {
        public long version;
        public long unlock_at;
        public long fee_limit;
        public long fee_used;
    }
    public static class GetExchangeCountReturnValue {
        public int count;
    }
    public static class GetExchangeReturnValue {
        public String name;
        public long quote_asset_id;
        public String addr;
        public long fee_balance;
    }
    public static class GetBalanceReturnValue {
        public BigInteger return_balance;
    }
    public static class GetAssetReturnValue {
        public String symbol;
        public long unit_scale;
        public String contract_address;
    }
    public static class GetAssetCountReturnValue {
        public int count;
    }
    public static class GetCreatorReturnValue {
        public String dcn_creator;
    }
    public static class GetSessionStateReturnValue {
        public long quote_qty;
        public long base_qty;
        public long quote_shift;
        public long base_shift;
        public long version;
        public long min_quote;
        public long min_base;
        public long long_max_price;
        public long short_min_price;
    }
    public static class GetSessionBalanceReturnValue {
        public long total_deposit;
        public long asset_balance;
    }
}
