/*
 * 
 */
package usecases.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import usecases.UsecasesPackage;
import usecases.diagram.edit.parts.ActorTitleEditPart;
import usecases.diagram.edit.parts.ExtendTypeEditPart;
import usecases.diagram.edit.parts.IncludeTypeEditPart;
import usecases.diagram.edit.parts.SystemTitleEditPart;
import usecases.diagram.edit.parts.UseCaseTitleEditPart;
import usecases.diagram.parsers.MessageFormatParser;
import usecases.diagram.part.UsecasesVisualIDRegistry;

/**
 * @generated
 */
public class UsecasesParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser systemTitle_5002Parser;

	/**
	* @generated
	*/
	private IParser getSystemTitle_5002Parser() {
		if (systemTitle_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { UsecasesPackage.eINSTANCE.getSystem_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			systemTitle_5002Parser = parser;
		}
		return systemTitle_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser actorTitle_5003Parser;

	/**
	* @generated
	*/
	private IParser getActorTitle_5003Parser() {
		if (actorTitle_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { UsecasesPackage.eINSTANCE.getActor_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorTitle_5003Parser = parser;
		}
		return actorTitle_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser useCaseTitle_5001Parser;

	/**
	* @generated
	*/
	private IParser getUseCaseTitle_5001Parser() {
		if (useCaseTitle_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { UsecasesPackage.eINSTANCE.getUseCase_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			useCaseTitle_5001Parser = parser;
		}
		return useCaseTitle_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser extendType_6001Parser;

	/**
	* @generated
	*/
	private IParser getExtendType_6001Parser() {
		if (extendType_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { UsecasesPackage.eINSTANCE.getExtend_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			extendType_6001Parser = parser;
		}
		return extendType_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser includeType_6002Parser;

	/**
	* @generated
	*/
	private IParser getIncludeType_6002Parser() {
		if (includeType_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { UsecasesPackage.eINSTANCE.getInclude_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			includeType_6002Parser = parser;
		}
		return includeType_6002Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SystemTitleEditPart.VISUAL_ID:
			return getSystemTitle_5002Parser();
		case ActorTitleEditPart.VISUAL_ID:
			return getActorTitle_5003Parser();
		case UseCaseTitleEditPart.VISUAL_ID:
			return getUseCaseTitle_5001Parser();
		case ExtendTypeEditPart.VISUAL_ID:
			return getExtendType_6001Parser();
		case IncludeTypeEditPart.VISUAL_ID:
			return getIncludeType_6002Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(UsecasesVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UsecasesVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UsecasesElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
