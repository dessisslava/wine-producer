package gr.uoc.imse.winepro.ws.wine.list;

import gr.uoc.imse.winepro.dto.WineDto;
import gr.uoc.imse.winepro.service.WineService;
import java.util.Iterator;
import java.util.List;
import com.alaz.service.exception.ServiceException;

public class WineProWineListWs
{

	private WineService wineService;

	public WineProWineListWs ()
	{
	}

	public void setWineService ( WineService wineService )
	{
		this.wineService = wineService;
	}

	public WineDto [] listAllWinesInBetween ( int firstResult, int maxResults )
	{
		System.out.println( "This is listAllWinesInBetween!!!" );
		List < WineDto > wineList = null;
		try
		{
			wineList = this.wineService.findAll( firstResult, maxResults );
		}
		catch ( ServiceException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WineDto [] wineArray = null;
		if ( wineList != null && wineList.size() != 0 )
		{
			wineArray = new WineDto [ wineList.size() ];
			int i = 0;
			for ( Iterator it = wineList.iterator(); it.hasNext(); )
			{
				WineDto wineDto = (WineDto) it.next();
				wineArray [ i ] = wineDto;
				i++;
			}
		}

		return wineArray;
	}

	public WineDto [] listAllWines ()
	{
		System.out.println( "This is listAllWines!!!" );
		List < WineDto > wineList = null;
		try
		{
			wineList = this.wineService.findAll();
		}
		catch ( ServiceException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WineDto [] wineArray = null;
		if ( wineList != null && wineList.size() != 0 )
		{
			wineArray = new WineDto [ wineList.size() ];
			int i = 0;
			for ( Iterator it = wineList.iterator(); it.hasNext(); )
			{
				WineDto wineDto = (WineDto) it.next();
				wineArray [ i ] = wineDto;
				i++;
			}
		}

		return wineArray;
	}

}
